@file:OptIn(ExperimentalJsExport::class)
package app

import kotlinx.browser.window
import react.*
import react.dom.html.ReactHTML.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.js.Date

@Serializable
data class User(val name: String, val cpf: String, val phone: String, val email: String)

external interface FormProps : Props {
    var onSaved: (User) -> Unit
}

val initialUsers = arrayOf(
    User("Joao da Silva","26899337649","4233335555","joao@joaosilva.com.br"),
    User("Maria Antonieta","65138896180","1255553333","maria@mariaantonieta.com.br"),
    User("Luiz Souza","32420496329","1144446666","luiz@luizsouza.com.br")
)

val FormPage = FC<Props> {
    val (name, setName) = useState("")
    val (cpf, setCpf) = useState("")
    val (phone, setPhone) = useState("")
    val (email, setEmail) = useState("")
    val (errors, setErrors) = useState(mutableMapOf<String,String>())
    val (loading, setLoading) = useState(false)

    fun validate(): Boolean {
        val err = mutableMapOf<String,String>()
        if (name.trim().isEmpty()) err["name"] = "Nome obrigatório"
        if (!Regex("\\d{11}").matches(cpf)) err["cpf"]="CPF inválido"
        if (!Regex("\\d{10,11}").matches(phone)) err["phone"]="Telefone inválido"
        if (!email.contains("@")) err["email"]="Email inválido"
        setErrors(err)
        return err.isEmpty()
    }

    fun saveLocal(user: User) {
        val key = "users_kotlinjs_v1"
        val raw = window.localStorage.getItem(key)
        val list = if (raw == null) initialUsers.toMutableList() else Json.decodeFromString(Array<User>::class.java, raw).toMutableList()
        list.add(user)
        window.localStorage.setItem(key, Json.encodeToString(list.toTypedArray()))
    }

    h2 { +"Cadastro de Usuário" }

    div {
        form {
            onSubmit = {
                it.preventDefault()
                if (!validate()) return@form
                setLoading(true)
                // simulate delay
                window.setTimeout({
                    val user = User(name, cpf, phone, email)
                    saveLocal(user)
                    setName(""), setCpf(""), setPhone(""), setEmail("")
                    setLoading(false)
                    window.location.hash = "#/list"
                }, 700)
            }
            div {
                label { +"Nome Completo:" }
                input {
                    value = name
                    onChange = { setName(it.target.value) }
                    // className styling left to CSS
                }
                if (errors["name"] != null) small { +errors["name"]!! }
            }
            div {
                label { +"CPF:" }
                input {
                    value = cpf
                    onChange = { setCpf(it.target.value) }
                }
                if (errors["cpf"] != null) small { +errors["cpf"]!! }
            }
            div {
                label { +"Telefone:" }
                input {
                    value = phone
                    onChange = { setPhone(it.target.value) }
                }
                if (errors["phone"] != null) small { +errors["phone"]!! }
            }
            div {
                label { +"Email:" }
                input {
                    value = email
                    onChange = { setEmail(it.target.value) }
                }
                if (errors["email"] != null) small { +errors["email"]!! }
            }
            div {
                button {
                    type = ButtonType.submit
                    disabled = loading
                    +if (loading) "Salvando..." else "Salvar"
                }
            }
        }
    }
}
