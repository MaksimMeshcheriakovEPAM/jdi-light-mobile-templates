package nativeapp_android.tests;

import com.epam.jdi.light.mobile.elements.composite.MobileScreen;
import nativeapp.android.apidemos.IndexPage;
import nativeapp_android.ApiDemosTestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.mobile.elements.complex.Images.itemIsSelected;
import static com.epam.jdi.light.mobile.elements.complex.Images.select;
import static nativeapp.android.apidemos.IndexPage.viewsPage;
import static nativeapp.android.apidemos.views.GalleryPage.photos;
import static nativeapp.android.apidemos.views.ViewsPage.galleryPage;

public class GalleryTests extends ApiDemosTestInit {

    private WebElement element;

    @BeforeMethod
    public void init() {
        MobileScreen.scrollToElementInList(IndexPage.goToViewPage);
        viewsPage.click();
        MobileScreen.scrollToElementInList(galleryPage);
        galleryPage.click();
        photos.click();
    }

    @Test
    public void selectPhotosInGallery() {
        element = select(0);
        itemIsSelected(element,true);

        element = select(1);
        itemIsSelected(element,false);

        element.click();
        itemIsSelected(element,true);
    }
}