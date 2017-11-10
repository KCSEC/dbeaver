package org.jkiss.dbeaver.runtime.internal.ui;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.services.nls.BaseMessageRegistry;
import org.eclipse.e4.core.services.nls.Translation;

@Creatable
public class OsgiMessageRegistry extends BaseMessageRegistry<OsgiMessages> {

    @Override
    @Inject
    public void updateMessages(@Translation OsgiMessages messages)
    {
        super.updateMessages(messages);
    }

}
