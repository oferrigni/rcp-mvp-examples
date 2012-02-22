package pizza.chooser.ui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import pizza.chooser.model.ApplicationModel;
import pizza.chooser.view.ApplicationView;
import pizza.chooser.presenter.ApplicationPresenter;

public class ApplicationFrameworkView extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		new ApplicationPresenter(new ApplicationView(parent), new ApplicationModel()).init();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
