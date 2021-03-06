package ee.netgroup.hm.page;

import ee.netgroup.hm.components.ReportImproperModal;
import ee.netgroup.hm.components.Search;
import ee.netgroup.hm.components.UserMenu;
import ee.netgroup.hm.helpers.Constants;

public class LandingPage extends Page{

	public static LandingPage goToLandingPage() {
		getDriver().get(Constants.landingPage);
		return new LandingPage();
	}
	
	public MyPortfoliosPage chooseUserType(String userType) {

		if (userType == "Admin")
			getDriver().get(Constants.admin);

		if (userType == "Publisher")
			getDriver().get(Constants.publisher);

		if (userType == "User")
			getDriver().get(Constants.user);
		
		if (userType == "Moderator")
			getDriver().get(Constants.moderator);
		
		if (userType == "Restricted")
			getDriver().get(Constants.restricted);

		return new MyPortfoliosPage();
	}

	public String isPortfolioDeletedTextVisible() {
		return getDriver().findElement(Constants.toastText).getText();
	}

	public UserMenu logoutIfLoggedIn() {
		return UserMenu.logoutIfLoggedIn();
	}

	public UserMenu clickOnUserProfile() {
		return UserMenu.clickProfileIcon();
	}

	public boolean getAddPortfolioMessageText() {
		return MyPortfoliosPage.getAddPortfolioMessageText();
	}

	public boolean getAddMaterialMessageText() {
		return MyMaterialsPage.getAddMaterialMessageText();
	}

	public boolean getAddFavoritesMessageText() {
		return MyFavoritesPage.getAddFavoritesMessageText();
	}

	public static MaterialPage openMaterial() {
		getDriver().findElement(Constants.firstMaterial).click();
		return new MaterialPage();
	}
	
	public static PortfolioPage openPortfolio() {
		getDriver().findElement(Constants.firstPortfolio).click();
		return new PortfolioPage();
	}

	public static MaterialPage openMaterialUrl() {
		getDriver().get(Constants.materialWithCommentsUrl);
		return new MaterialPage();
	}

	public SearchResultsPage searchTag(String tag) {
		return Search.searchTag(tag);
	}

	public ReportImproperModal getReportImproperPopUp() {
		return ReportImproperModal.getReportImproperPopUp();
	}



}
