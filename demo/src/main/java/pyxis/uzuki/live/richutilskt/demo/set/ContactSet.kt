package pyxis.uzuki.live.richutilskt.demo.set

import android.content.Context
import pyxis.uzuki.live.richutilskt.demo.R
import pyxis.uzuki.live.richutilskt.demo.item.CategoryItem
import pyxis.uzuki.live.richutilskt.demo.item.ExecuteItem
import pyxis.uzuki.live.richutilskt.demo.item.generateExecuteItem

/**
 * Created by pyxis on 06/11/2017.
 */

fun Context.getContactSet() : ArrayList<ExecuteItem> {
    val list = arrayListOf<ExecuteItem>()

    val getContactsList = generateExecuteItem(CategoryItem.CONTACT, "getContactsList",
            getString(R.string.contact_message_getcontactslist),
            "getContactsList()",
            "RichUtils.getContactsList(this);")

    list.add(getContactsList)

    return list
}