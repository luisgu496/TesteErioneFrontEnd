@file:OptIn(ExperimentalJsExport::class)
package app

import kotlinx.browser.window
import react.*
import react.dom.html.ReactHTML.*

@Serializable
data class UserSerializable(val name: String, val cpf: String, val phone: String, val email: String)

val ListPage = FC<Props> {
    val (users, setUsers) = useState(emptyArray<User>())
    val (editingCpf, setEditingCpf) = useState<String?>(null)
    val (editedUser, setEditedUser) = useState(User("","","",""))

    fun load() {
        val key = "users_kotlinjs_v1"
        val raw = window.localStorage.getItem(key)
        if (raw == null) {
            window.localStorage.setItem(key, kotlinx.serialization.json.Json.encodeToString(initialUsers))
            setUsers(initialUsers)
        } else {
            try {
                val arr = kotlinx.serialization.json.Json.decodeFromString(Array<User>::class.java, raw)
                setUsers(arr)
            } catch (e: Throwable) {
                setUsers(initialUsers)
            }
        }
    }

    useEffectOnce { load() }

    h2 { +"Lista de Usuários" }

    table {
        thead {
            tr {
                th { +"Nome" }; th { +"CPF" }; th { +"Telefone" }; th { +"Email" }; th { +"Ações" }
            }
        }
        tbody {
            users.forEach { u ->
                tr {
                    td { +u.name }
                    td { +u.cpf }
                    td { +u.phone }
                    td { +u.email }
                    td {
                        button {
                            +"Editar"
                            onClick = {
                                setEditingCpf(u.cpf)
                                setEditedUser(u)
                            }
                        }
                        button {
                            +"Excluir"
                            onClick = {
                                if (window.confirm("Confirma exclusão?")) {
                                    val remaining = users.filter { it.cpf != u.cpf }.toTypedArray()
                                    window.localStorage.setItem("users_kotlinjs_v1", kotlinx.serialization.json.Json.encodeToString(remaining))
                                    setUsers(remaining)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
