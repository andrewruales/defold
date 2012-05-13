package com.dynamo.cr.editor.dialogs;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.util.Geometry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import com.dynamo.cr.editor.Activator;

public class AboutDialog extends Shell {

    // NOTE: Currently hard-coded
    // Non-trivial to find the product number :-(
    private static final String VERSION = "1.1.7";
    private static final String NEW_LINE = System.getProperty("line.separator");

    public AboutDialog(Shell shell) {
        super(shell, SWT.CLOSE | SWT.TITLE);
        setText("About Defold Editor");
        setLayout(GridLayoutFactory.fillDefaults().spacing(0, 5).margins(0, 0)
                .create());
        createContents();
    }

    @Override
    protected void checkSubclass() {
    }

    /**
     * Create contents of the shell.
     */
    protected void createContents() {
        setSize(394, 364);

        setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));

        Label graphic = newLabel(SWT.SHADOW_NONE | SWT.CENTER);
        GridDataFactory.fillDefaults().grab(true, true)
                .align(SWT.FILL, SWT.FILL).hint(316, 416).applyTo(graphic);
        graphic.setImage(Activator.getImageDescriptor("icons/about.png")
                .createImage());

        Label productNameLabel = newLabel(SWT.BOLD);
        productNameLabel.setFont(JFaceResources.getBannerFont());
        productNameLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER,
                false, false, 1, 1));
        productNameLabel.setText("Defold Editor");

        StyledText buildDetailsText = new StyledText(this, SWT.NONE);
        buildDetailsText.setLineSpacing(7);
        buildDetailsText.setBackground(Display.getDefault().getSystemColor(
                SWT.COLOR_WHITE));
        buildDetailsText.setEditable(false);
        GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER)
                .applyTo(buildDetailsText);

        StringBuilder builder = new StringBuilder();

        // NOTE: Currently hard-coded
        // Non-trivial to find the product number :-(
        builder.append(String.format("Version %s", VERSION));
        builder.append(NEW_LINE);

        buildDetailsText.setText(builder.toString());
        buildDetailsText.getCaret().setSize(0, 0); // nuke the caret

        newLabel(SWT.NONE);

        Label copyrightLabel = newLabel(SWT.NONE);
        GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER)
                .applyTo(copyrightLabel);
        copyrightLabel.setText("Copyright (c) 2011-2012, Defold");

        Label copyrightLabel2 = newLabel(SWT.NONE);
        GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER)
                .applyTo(copyrightLabel2);
        copyrightLabel2.setText("All Rights Reserved");
        newLabel(SWT.NONE);
        setLocation(getInitialLocation(getSize()));
    }

    protected Point getInitialLocation(Point initialSize) {
        Composite parent = getParent();

        Rectangle parentBounds = parent.getClientArea();
        Point centerPoint = Geometry.centerPoint(parent.getBounds());

        return new Point(centerPoint.x - (initialSize.x / 2), Math.max(
                parentBounds.y, Math.min(centerPoint.y
                        - (initialSize.y * 2 / 3), parentBounds.y
                        + parentBounds.height - initialSize.y)));
    }

    private Label newLabel(int style) {
        Label label = new Label(this, style);
        label.setBackground(Display.getDefault()
                .getSystemColor(SWT.COLOR_WHITE));
        return label;
    }
}
