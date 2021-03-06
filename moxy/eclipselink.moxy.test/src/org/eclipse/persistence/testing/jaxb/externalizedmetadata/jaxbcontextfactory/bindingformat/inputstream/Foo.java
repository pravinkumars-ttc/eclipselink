/*
 * Copyright (c) 1998, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
// dmccann - Novemner 11/2010 - 2.2 - Initial implementation
package org.eclipse.persistence.testing.jaxb.externalizedmetadata.jaxbcontextfactory.bindingformat.inputstream;

public class Foo {
    public String id;

    public Foo() {}
    public Foo(String id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        Foo f;
        try {
            f = (Foo) o;
        } catch (ClassCastException e) {
            return false;
        }
        return this.id.equals(f.id);
    }
}
