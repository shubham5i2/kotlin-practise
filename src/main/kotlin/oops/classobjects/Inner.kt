package oops.classobjects

fun main() {
    val listView = ListView(arrayOf("Sachin", "Dravid", "Virat", "Rohit"))
    listView.ListViewItem().getItemAtPosition(2)
}

class ListView(val items: Array<String>) {

    inner class ListViewItem() {

        fun getItemAtPosition(position: Int) {
            println("Item at position $position is ${items[position]}")
        }
    }
}