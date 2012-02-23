package pizza.chooser.presenter;

import pizza.chooser.model.ApplicationModel;
import pizza.chooser.model.IApplicationModelListener;
import pizza.chooser.presenter.viewinterfaces.IApplicationView;

public class ApplicationPresenter implements IApplicationModelListener {

	private final IApplicationView applicationView;
	private final ApplicationModel applicationModel;

	public ApplicationPresenter(IApplicationView applicationView,
			ApplicationModel applicationModel) {
				this.applicationView = applicationView;
				this.applicationModel = applicationModel;
	}

	public void init() {
		applicationModel.registerApplicationModelListener(this);
		applicationView.layout(this);
	}

	public void applicationViewLayedOut() {
		
	}

}
