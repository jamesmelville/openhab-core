/**
 * Copyright (c) 2010-2022 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.core.automation.dto;

import org.openhab.core.automation.Module;

/**
 * This is a utility class to convert between the respective object and its DTO.
 *
 * @author Markus Rathgeb - Initial contribution
 */
public class ModuleDTOMapper {

    protected static void fillProperties(final Module from, final ModuleDTO to) {
        to.id = from.getId();
        to.label = from.getLabel();
        to.description = from.getDescription();
        to.configuration = from.getConfiguration().getProperties();
        to.type = from.getTypeUID();
    }
}
