package com.dynamo.cr.ddfeditor.scene;

import com.dynamo.cr.go.core.ComponentTypeNode;
import com.dynamo.cr.properties.NotEmpty;
import com.dynamo.cr.properties.Property;
import com.dynamo.cr.properties.Resource;
import com.dynamo.cr.properties.Property.EditorType;

@SuppressWarnings("serial")
public class FactoryNode extends ComponentTypeNode {

    @Property(editorType=EditorType.RESOURCE, extensions={"go"})
    @Resource
    @NotEmpty
    private String prototype = "";

    public FactoryNode() {
        super();
    }

    public String getPrototype() {
        return this.prototype;
    }

    public void setPrototype(String prototype) {
        this.prototype = prototype;
    }

}
