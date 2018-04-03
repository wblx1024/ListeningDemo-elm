package scarlet.soft.hit.listeningdemo

import android.accessibilityservice.AccessibilityService
import android.support.annotation.UiThread
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo

/**
 * Created by Scarlet on 2018/3/12.
 */
class ListeningAccessibility : AccessibilityService() {
    override fun onInterrupt() {
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        if (event.eventType == AccessibilityEvent.TYPE_VIEW_CLICKED) {
            val nodeInfo: AccessibilityNodeInfo? = rootInActiveWindow

            val shopname = nodeInfo?.findAccessibilityNodeInfosByViewId("android:id/name")?.firstOrNull()
            val dining_experience = nodeInfo?.findAccessibilityNodeInfosByViewId("android:id/rating_level")?.firstOrNull()
            val word_evaluation = nodeInfo?.findAccessibilityNodeInfosByViewId("android:id/edit_text")?.firstOrNull()
            val arrive_time = nodeInfo?.findAccessibilityNodeInfosByViewId("android:id/arrive_time")?.firstOrNull()

//            val aptList = nodeInfo?.findAccessibilityNodeInfosByViewId("com.tencent.mm:id/apz")
            val propertyList = nodeInfo?.findAccessibilityNodeInfosByViewId("me.ele:id/property")?.firstOrNull()
            val property_attitudeList = nodeInfo?.findAccessibilityNodeInfosByViewId("me.ele:id/attitude")?.firstOrNull()
            val rate_likeList = nodeInfo?.findAccessibilityNodeInfosByViewId("me.ele:id/rate_like")?.firstOrNull()
            val rate_dislikeList = nodeInfo?.findAccessibilityNodeInfosByViewId("me.ele:id/rate_dislike")?.firstOrNull()

            propertyList?.forEach({ Log.d("${title?.text}-property", "${it.text}") })
            property_attitudeList?.forEach({ Log.d("${title?.text}-attitude", "${it.text}") })
            rate_likeList?.forEach({ Log.d("${title?.text}-rate_like", "${it.text}") })
            rate_dislikeList?.forEach({ Log.d("${title?.text}-rate_dislike", "${it.text}") })


            //时间
            var result = ""


//            while (nodeInfo != null && nodeInfo.childCount != 0) {
//                if (nodeInfo.className == "android.widget.ListView") {
//                    for (i in 0 until nodeInfo.childCount) {
//                        val node = nodeInfo.getChild(i)
//                        for(j in 0 until node.childCount){
////                            val myApx = node.findAccessibilityNodeInfosByViewId("apx")
//                            Log.d("OJBK", "${node.getChild(j).className}")
//                        }
//
//
//                    }
//                }
//                nodeInfo = nodeInfo.getChild(0)
//            }

//            if (nodeInfo != null) {
//                for (i in 0 until nodeInfo.childCount) {
//                    val myList = nodeInfo.getChild(i)
//                    Log.d("OJBK", "${nodeInfo.childCount}-${myList.className}")
//                    if (myList.className.equals("android.widget.ListView")) {
//                        val myApx = myList.findAccessibilityNodeInfosByViewId("apx")
//                        Log.d("OJBK", "${myApx.size}")
//                    }
//                }
//            }


//            for (i in 0..nodeInfo.childCount) {
//                Log.d("OJBK", "${event.className}\n${nodeInfo.getChild(i).text}")
        }
//        val tp:Int = event.eventType
//        when (tp) {
//            AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED -> {
//                val nodeInfo: AccessibilityNodeInfo = rootInActiveWindow
//                for (i in 0..nodeInfo.childCount) {
//                    Log.d("OJBK", "${event.className}\n${nodeInfo.getChild(i).text}")
//                }
//            }
    }
}