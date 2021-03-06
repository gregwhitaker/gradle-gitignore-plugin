/**
 * Copyright 2017-Present Greg Whitaker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.gregwhitaker.gitignore.facets;

import org.gradle.api.Project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Adds facets based on the language plugins detected.
 */
public class LanguageFacetDetector extends BasePluginFacetDetector {

    public LanguageFacetDetector(final Project project) {
        super(project);
    }

    @Override
    Map<String, List<String>> pluginToFacetsMappings() {
        final Map<String, List<String>> mappings = new HashMap<>();
        mappings.put("java", Arrays.asList("java"));
        mappings.put("java-library", Arrays.asList("java"));
        mappings.put("java-platform", Arrays.asList("java"));
        mappings.put("groovy", Arrays.asList("java"));
        mappings.put("grails", Arrays.asList("grails"));

        return mappings;
    }
}
