package pizza.chooser.view;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import pizza.chooser.presenter.ApplicationPresenter;
import pizza.chooser.presenter.viewinterfaces.IApplicationView;

public class ApplicationView implements IApplicationView {

	private final Composite parent;
	private final CompositeProvider compositeProvider;

	public ApplicationView(Composite parent) {
		this(parent, new CompositeProvider());
	}

	ApplicationView(Composite parent,
			CompositeProvider compositeProvider) {
		this.parent = parent;
		this.compositeProvider = compositeProvider;
	}

	@Override
	public void layout(ApplicationPresenter presenter) {
		Composite child = compositeProvider.provide(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().applyTo(parent);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(child);
		GridLayoutFactory.fillDefaults().numColumns(3).applyTo(child);
		child.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));	
	}

	public static class CompositeProvider {
		public Composite provide(Composite input, int style) {
			return new Composite(input, style);
		}
	}
}
