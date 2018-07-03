/*
 * Example Plugin for SonarQube
 * Copyright (C) 2009-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarsource.solidity;

import org.sonar.api.Plugin;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

/**
 * This class is the entry point for all extensions. It is referenced in pom.xml.
 */
public class SolidityPlugin implements Plugin {

  public static final String FILE_SUFFIXES_KEY = "sonar.solidity.file.suffixes";
  public static final String FILE_SUFFIXES_DEFAULT_VALUE = ".sol";

  @Override
  public void define(Context context) {

    // language
    context.addExtension(Solidity.class);
    context.addExtension(SolidityRulesDefinition.class);
    context.addExtension(SolidityProfile.class);
    context.addExtension(SoliditySensor.class);

    // hooks
    // http://docs.sonarqube.org/display/DEV/Adding+Hooks
    // context.addExtensions(DisplayIssuesInScanner.class, DisplayQualityGateStatus.class);

    // web extensions
    // context.addExtension(MyPluginPageDefinition.class);

    context.addExtension(
      PropertyDefinition.builder(FILE_SUFFIXES_KEY)
        .defaultValue(FILE_SUFFIXES_DEFAULT_VALUE)
        .category("Solidity")
        .name("File Suffixes")
        .description("Comma-separated list of suffixes for files to analyze.")
        .onQualifiers(Qualifiers.PROJECT)
        .multiValues(true)
        .build());
  }
}
