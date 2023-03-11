/*
 * This file is part of Charon.
 *
 * Charon is a framework for Spigot plugin development
 * Copyright (C) 2023  SickSkillz
 *
 * Charon is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Charon is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Charon.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.sickskillz.charon;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class CharonFramework {

    private static @Nullable Plugin plugin = null;

    private CharonFramework() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static void init(@NotNull Plugin plugin) {
        Objects.requireNonNull(plugin);
        CharonFramework.plugin = plugin;
    }

    public static Plugin getPlugin() {
        if (plugin == null) {
            throw new IllegalStateException("A Charon Framework method was called or a class was instantiated before Charon was initialized! You have to initialize it first by calling Charon.init(Plugin)");
        }

        return plugin;
    }
}
