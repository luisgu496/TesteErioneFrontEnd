import kotlinx.browser.document
import react.create
import react.dom.client.createRoot
import app.FormPage
import app.ListPage
import react.dom.html.ReactHTML.div

fun main() {
    val root = document.getElementById("root") ?: error("No root element")
    createRoot(root).render(
        div { 
            // choose to render FormPage by default; navigation handled inside components via hash
            FormPage.create {}
        }
    )
}
