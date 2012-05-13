package com.dynamo.cr.sceneed.ui;

import org.eclipse.core.resources.IContainer;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.operations.RedoActionHandler;
import org.eclipse.ui.operations.UndoActionHandler;

import com.dynamo.cr.properties.FormPropertySheetPage;
import com.google.inject.Inject;

public class ScenePropertySheetPage extends FormPropertySheetPage {

    private final UndoActionHandler undoHandler;
    private final RedoActionHandler redoHandler;

    @Inject
    public ScenePropertySheetPage(IContainer contentRoot, UndoActionHandler undoHandler, RedoActionHandler redoHandler) {
        super(contentRoot);
        this.undoHandler = undoHandler;
        this.redoHandler = redoHandler;
    }

    @Override
    public void setActionBars(IActionBars actionBars) {
        super.setActionBars(actionBars);
        actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), this.undoHandler);
        actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), this.redoHandler);
    }

}
