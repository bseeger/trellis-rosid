/*
 * Copyright Amherst College
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.amherst.acdc.trellis.rosid;

/**
 * @author acoburn
 */
public class RdfSource extends AbstractBaseResource {

    /**
     * Create an LDP Container object
     * @param reader a reader for the resource
     */
    public RdfSource(final ResourceReader reader) {
        super(reader);
    }

    @Override
    public Boolean isRdfSource() {
        return true;
    }

}
