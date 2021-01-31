/*
 * Copyright 2021 <a href="mailto:dev@aeonsvirtue.com">Aeon's Virtue (K. Geltmeier)</a>.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * Version v. 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * If a copy of the MPL was not distributed with this file, you can obtain one
 * at
 *
 *      https://mozilla.org/MPL/2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aeonsvirtue.fontviewer;

import javax.swing.JLabel;

/**
 *
 * @author <a href="mailto:dev@aeonsvirtue.com">Aeon's Virtue (K. Geltmeier)</a>
 */
public class Label extends JLabel {
    private String[] text;

    public void setText(String[] text) {
        this.text = text;
    }
    
    @Override
    public String getText() {
        return text == null || text.length == 0 || text[0] == null ? "invalid" : text[0];
    }
}
