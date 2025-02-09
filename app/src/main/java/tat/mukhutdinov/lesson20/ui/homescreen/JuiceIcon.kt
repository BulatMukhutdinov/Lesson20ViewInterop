package tat.mukhutdinov.lesson20.ui.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import tat.mukhutdinov.lesson20.R
import tat.mukhutdinov.lesson20.data.JuiceColor

/**
 * Custom icon for juice which is able to adjust for Dark Mode.
 * contentDescription for Box is added through semantics to support better accessibility.
 * Icons' contentDescription are nullified as its meaning has been explained by
 * the box's contentDescription
 */
@Composable
fun JuiceIcon(color: String, modifier: Modifier = Modifier) {
    val juiceIconContentDescription = stringResource(R.string.juice_color, color)
    Box(
        modifier.semantics {
            contentDescription = juiceIconContentDescription
        }
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_juice_color),
            contentDescription = null,
            tint = JuiceColor.valueOf(color).color,
            modifier = Modifier.align(Alignment.Center)
        )
        Icon(painter = painterResource(R.drawable.ic_juice_clear), contentDescription = null)
    }
}
