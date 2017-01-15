/*
 * Copyright 2017 Greg Whitaker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.gregwhitaker.gitignore.plugin.internal

abstract class BaseFacetDetector implements FacetDetector {

    abstract void facets(List<String> facets)

    void addFacetIfNotExists(String newFacet, List<String> facets) {
        if (!facets.contains(newFacet)) {
            facets << newFacet
        }
    }

    void addFacetsIfNotExists(List<String> newFacets, List<String> facets) {
        if (newFacets) {
            newFacets.each {
                if (!facets.contains(it)) {
                    facets << it
                }
            }
        }
    }

}