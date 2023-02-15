package de.diskostu.codelab.codelabbusinesscard

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, name = "pixel 5", device = "id:pixel_5")
@Preview(showBackground = true, name = "pixel 6 pro", device = "id:pixel_6_pro")
@Preview(showBackground = true, name = "tablet", device = "id:10.1in WXGA (Tablet)")
@Composable
fun AllTogetherNowPreview() {
    AllTogetherNow()
}


@Preview
@Composable
fun TitlePicturePreview() {
    TitlePicture(modifier = Modifier)
}


@Preview(showBackground = true)
@Composable
fun NameAndTitlePreview() {
    NameAndTitle(modifier = Modifier)
}


@Preview(showBackground = true)
@Composable
fun ContactLinesPreview() {
    ContactLines()
}