package pizza.chooser.product;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout pageLayout) {
		pageLayout.setEditorAreaVisible(false);
		pageLayout.addView("pizza.chooser.ui.application.view", IPageLayout.TOP, 1f, pageLayout.getEditorArea());
	}
}
