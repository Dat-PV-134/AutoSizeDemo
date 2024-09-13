import com.rekoj134.autosizedemo.TYPE_EXPENSE

data class Category(
    val id: Int = 0,
    val name: String,
    val icon: Int,
    val iconColor: String,
    val type: Int = TYPE_EXPENSE
)