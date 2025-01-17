/**
 * Copyright 2012 Vineet Semwal
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wicketstuff;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * @author Vineet Semwal
 */
public class QuickReuseIfModelsEqualStrategyTest extends AbstractPagingNavigationStrategyTest {
    @WicketTest
    public void isPaging_1() {
        super.assertIsPartialUpdatesSupported(new QuickReuseIfModelsEqualStrategy());
    }

    @WicketTest
    public void pageCreatedOnReRender_1() {
        super.assertPageCreatedOnReRender(new QuickReuseIfModelsEqualStrategy());
    }

    @WicketTest
    public void addItems_1() {
        assertThrows(IRepeaterUtil.ReuseStrategyNotSupportedException.class
                , () -> super.assertAddItems(new QuickReuseIfModelsEqualStrategy()));
    }
}
