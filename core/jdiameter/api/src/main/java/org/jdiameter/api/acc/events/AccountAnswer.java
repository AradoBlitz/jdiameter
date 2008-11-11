/**
 * Copyright (c) 2006 jDiameter.
 * https://jdiameter.dev.java.net/
 *
 * License: Lesser General Public License (LGPL)
 *
 * e-mail: erick.svenson@yahoo.com
 *
 */
package org.jdiameter.api.acc.events;

import org.jdiameter.api.app.AppAnswerEvent;
import org.jdiameter.api.AvpDataException;

/**
 * A Answer message is sent by a recipient of Request once it has
 * received and interpreted the Request.
 * @version 1.5.1 Final
 */
public interface AccountAnswer extends AppAnswerEvent {
    /**
     * @return Record type of answer
     * @throws org.jdiameter.api.AvpDataException if result code avp is not integer
     */
    int getAccountingRecordType() throws AvpDataException;

    /**
     * @return record number
     * @throws AvpDataException if result code avp is not integer
     */
    long getAccountingRecordNumber() throws AvpDataException;
}