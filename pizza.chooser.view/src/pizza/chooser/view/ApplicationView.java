package pizza.chooser.view;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import pizza.chooser.presenter.viewinterfaces.IApplicationView;

public class ApplicationView implements IApplicationView {

	private final Composite parent;

	public ApplicationView(Composite parent) {
		this.parent = parent;
	}

	@Override
	public void layout() {
		Composite child = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().applyTo(parent);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(child);
		GridLayoutFactory.fillDefaults().numColumns(3).applyTo(child);
		child.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));		
	}

}
