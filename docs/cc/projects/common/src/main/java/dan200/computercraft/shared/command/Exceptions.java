// SPDX-FileCopyrightText: 2019 The CC: Tweaked Developers
//
// SPDX-License-Identifier: MPL-2.0

package dan200.computercraft.shared.command;

import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.network.chat.Component;

public final class Exceptions {
    public static final DynamicCommandExceptionType COMPUTER_ARG_NONE = translated1("argument.computercraft.computer.no_matching");
    public static final Dynamic2CommandExceptionType COMPUTER_ARG_MANY = translated2("argument.computercraft.computer.many_matching");

    public static final DynamicCommandExceptionType TRACKING_FIELD_ARG_NONE = translated1("argument.computercraft.tracking_field.no_field");

    static final SimpleCommandExceptionType NOT_TRACKING_EXCEPTION = translated("commands.computercraft.track.stop.not_enabled");
    static final SimpleCommandExceptionType NO_TIMINGS_EXCEPTION = translated("commands.computercraft.track.dump.no_timings");

    public static final SimpleCommandExceptionType ARGUMENT_EXPECTED = translated("argument.computercraft.argument_expected");

    private static SimpleCommandExceptionType translated(String key) {
        return new SimpleCommandExceptionType(Component.translatable(key));
    }

    private static DynamicCommandExceptionType translated1(String key) {
        return new DynamicCommandExceptionType(x -> Component.translatable(key, x));
    }

    private static Dynamic2CommandExceptionType translated2(String key) {
        return new Dynamic2CommandExceptionType((x, y) -> Component.translatable(key, x, y));
    }
}