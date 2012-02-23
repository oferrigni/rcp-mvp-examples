package pizza.chooser.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.junit.Test;
import org.mockito.Mockito;

import pizza.chooser.presenter.ApplicationPresenter;
import pizza.chooser.view.ApplicationView.CompositeProvider;


public class ApplicationViewTest {

	@Test
	public void layout_should_notify_presenter_of_completion() {
		ApplicationPresenter mockPresenter = Mockito.mock(ApplicationPresenter.class);
		CompositeProvider mockProvider = Mockito.mock(CompositeProvider.class);
		Composite mockComposite = Mockito.mock(Composite.class);
		Mockito.stub(mockProvider.provide(mockComposite, SWT.NONE)).toReturn(mockComposite);
		ApplicationView testObject = new ApplicationView(mockComposite,mockProvider);
		
		testObject.layout(mockPresenter);
		
		Mockito.verify(mockPresenter).applicationViewLayedOut();
	}
}
