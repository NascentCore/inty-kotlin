// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.characterthemes

import com.fasterxml.jackson.annotation.JsonCreator
import com.inty.api.core.Enum
import com.inty.api.core.JsonField
import com.inty.api.errors.IntyInvalidDataException

/** 角色主题专区可见性 */
class CharacterThemeVisibility
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val PRIMARY = of("PRIMARY")

        val SECONDARY = of("SECONDARY")

        val HIDDEN = of("HIDDEN")

        fun of(value: String) = CharacterThemeVisibility(JsonField.of(value))
    }

    /** An enum containing [CharacterThemeVisibility]'s known values. */
    enum class Known {
        PRIMARY,
        SECONDARY,
        HIDDEN,
    }

    /**
     * An enum containing [CharacterThemeVisibility]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [CharacterThemeVisibility] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PRIMARY,
        SECONDARY,
        HIDDEN,
        /**
         * An enum member indicating that [CharacterThemeVisibility] was instantiated with an
         * unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            PRIMARY -> Value.PRIMARY
            SECONDARY -> Value.SECONDARY
            HIDDEN -> Value.HIDDEN
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws IntyInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            PRIMARY -> Known.PRIMARY
            SECONDARY -> Known.SECONDARY
            HIDDEN -> Known.HIDDEN
            else -> throw IntyInvalidDataException("Unknown CharacterThemeVisibility: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws IntyInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw IntyInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    fun validate(): CharacterThemeVisibility = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: IntyInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CharacterThemeVisibility && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
