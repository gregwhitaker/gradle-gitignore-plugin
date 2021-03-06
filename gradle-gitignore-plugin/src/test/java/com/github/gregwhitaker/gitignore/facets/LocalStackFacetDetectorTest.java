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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LocalStackFacetDetectorTest {

    @Mock
    private Project mockProject;

    @Test
    public void shouldHaveCorrectPluginToFacetMappings() {
        // Given
        LocalStackFacetDetector detector = new LocalStackFacetDetector(mockProject);

        // When
        Map<String, List<String>> mappings = detector.pluginToFacetsMappings();

        // Then
        assertEquals(1, mappings.size());

        assertEquals(1, mappings.get("com.nike.pdm.localstack").size());
        assertEquals("localstack", mappings.get("com.nike.pdm.localstack").get(0));
    }
}
