package pizza.chooser.presenter;

import org.junit.Test;
import org.mockito.Mockito;

import pizza.chooser.model.ApplicationModel;
import pizza.chooser.presenter.viewinterfaces.IApplicationView;

public class ApplicationPresenterTest {

	@Test
	public void init_should_register_with_model_then_request_view_to_layout() {
		IApplicationView mockView = Mockito.mock(IApplicationView.class);
		ApplicationModel mockModel = Mockito.mock(ApplicationModel.class);
		ApplicationPresenter testObject = new ApplicationPresenter(mockView, mockModel);
		testObject.init();
		
		Mockito.verify(mockModel).registerApplicationModelListener(testObject);
		Mockito.verify(mockView).layout();
	}
}
