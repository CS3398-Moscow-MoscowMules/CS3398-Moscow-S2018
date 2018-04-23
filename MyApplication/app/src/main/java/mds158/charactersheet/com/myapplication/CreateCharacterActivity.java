<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="mds158.charactersheet.com.myapplication.CreateCharacterActivity">

    <ScrollView
        android:id="@+id/scroller"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fillViewport="true"
        android:gravity="bottom"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0">

        <RelativeLayout
            android:layout_width="fill_parent"
            android:layout_height="wrap_content">

            <TableLayout
                android:layout_width="fill_parent"
                android:layout_height="fill_parent"
                android:stretchColumns="1">

                <TextView
                    android:id="@+id/textView2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="12dp"
                    android:gravity="center"
                    android:text="@string/GenAttr" />

                <EditText
                    android:id="@+id/name"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:hint="@string/hintName"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/textView2" />

                <Spinner
                    android:id="@+id/race"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="45dp"
                    android:entries="@array/race_arrays"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/name" />

                <Spinner
                    android:id="@+id/spells"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="16dp"
                    android:entries="@array/spells_arrays"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/race" />

                <Spinner
                    android:id="@+id/classification"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="16dp"
                    android:entries="@array/class_arrays"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintHorizontal_bias="0.0"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/spells" />

                <Spinner
                    android:id="@+id/weapons_spinner"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="17dp"
                    android:entries="@array/weapons_arrays"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/classification" />

                <Spinner
                    android:id="@+id/shield_spinner"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="15dp"
                    android:entries="@array/shield_arrays"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/weapons_spinner" />

                <Spinner
                    android:id="@+id/armor_spinner"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="14dp"
                    android:entries="@array/armor_arrays"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/shield_spinner" />

                <Spinner
                    android:id="@+id/alignment"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="15dp"
                    android:entries="@array/alignment_arrays"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/armor_spinner" />

                <Spinner
                    android:id="@+id/background"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="13dp"
                    android:entries="@array/background_arrays"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/alignment" />

                <!--****************************************************************************-->
                <!--*************************END OF SPINNERS************************************-->
                <!--****************************************************************************-->

                <TextView
                    android:id="@+id/textAttributes"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="20dp"
                    android:gravity="center"
                    android:text="@string/PhysAttr" />

                <EditText
                    android:id="@+id/strength"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:hint="@string/hintStrength"
                    android:inputType="number"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/background" />

                <EditText
                    android:id="@+id/dexterity"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:hint="@string/hintDext"
                    android:inputType="number"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/strength" />

                <EditText
                    android:id="@+id/constitution"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:hint="@string/hintConst"
                    android:inputType="number"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/dexterity" />

                <EditText
                    android:id="@+id/intelligence"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:hint="@string/hintIntel"
                    android:inputType="number"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/constitution" />

                <EditText
                    android:id="@+id/wisdom"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:hint="@string/hintWisdom"
                    android:inputType="number"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/intelligence" />

                <EditText
                    android:id="@+id/charisma"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:hint="@string/hintCharisma"
                    android:inputType="number"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/wisdom" />

                <TextView
                    android:id="@+id/language"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:gravity="center"
                    android:text="@string/languages"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/charisma"/>

                <CheckBox
                    android:id="@+id/Abyssal"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Abyssal"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/language"/>

                <CheckBox
                    android:id="@+id/Aquan"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Aquan"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Abyssal"/>

                <CheckBox
                    android:id="@+id/Auran"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Auran"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Aquan"/>

                <CheckBox
                    android:id="@+id/Celestial"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Celestial"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Auran"/>

                <CheckBox
                    android:id="@+id/Common"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Common"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Celestial"/>

                <CheckBox
                    android:id="@+id/DeepSpeech"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/DeepSpeech"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Common"/>

                <CheckBox
                    android:id="@+id/Draconic"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Draconic"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/DeepSpeech"/>

                <CheckBox
                    android:id="@+id/DrowHand"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Drow"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Draconic"/>

                <CheckBox
                    android:id="@+id/Druidic"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Druidic"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/DrowHand"/>

                <CheckBox
                    android:id="@+id/Dwarvish"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Dwarvish"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Druidic"/>

                <CheckBox
                    android:id="@+id/Elvish"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Elvish"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Dwarvish"/>

                <CheckBox
                    android:id="@+id/Giant"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Giant"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Elvish"/>

                <CheckBox
                    android:id="@+id/Gnomish"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Gnomish"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Giant"/>

                <CheckBox
                    android:id="@+id/Goblin"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Goblin"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Gnomish"/>

                <CheckBox
                    android:id="@+id/Gnoll"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Gnoll"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Goblin"/>

                <CheckBox
                    android:id="@+id/Halfling"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Halfling"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Gnoll"/>

                <CheckBox
                    android:id="@+id/Ignan"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Ignan"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Halfling"/>

                <CheckBox
                    android:id="@+id/Infernal"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Infernal"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Ignan"/>

                <CheckBox
                    android:id="@+id/Orc"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Orc"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Infernal"/>

                <CheckBox
                    android:id="@+id/Primordial"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Primordial"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Orc"/>

                <CheckBox
                    android:id="@+id/SilentSp"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Silent"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Orc"/>

                <CheckBox
                    android:id="@+id/Sylvan"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Sylvan"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Primordial"/>

                <CheckBox
                    android:id="@+id/Terran"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Terran"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Sylvan"/>

                <CheckBox
                    android:id="@+id/Undercommon"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Undercommon"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/Terran"/>

                <TextView
                    android:id="@+id/strengthProf"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:gravity="center"
                    android:text="@string/StrengthProf"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@id/Undercommon" />

                <CheckBox
                    android:id="@+id/athletics"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Athletics"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/strengthProf" />

                <TextView
                    android:id="@+id/dexterityProf"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:gravity="center"
                    android:text="@string/DextProf"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/athletics" />

                <CheckBox
                    android:id="@+id/acrobatics"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Acro"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/dexterityProf" />

                <CheckBox
                    android:id="@+id/sleightOfHand"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/SOH"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/acrobatics" />

                <CheckBox
                    android:id="@+id/stealth"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Stealth"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/sleightOfHand" />

                <TextView
                    android:id="@+id/intelligenceProf"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:gravity="center"
                    android:text="@string/IntelProf"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/stealth" />

                <CheckBox
                    android:id="@+id/arcana"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Arcana"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/intelligenceProf" />

                <CheckBox
                    android:id="@+id/history"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/History"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/arcana" />

                <CheckBox
                    android:id="@+id/investigation"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Investig"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/history" />

                <CheckBox
                    android:id="@+id/nature"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Nature"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/investigation" />

                <CheckBox
                    android:id="@+id/religion"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Religion"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/nature" />

                <TextView
                    android:id="@+id/wisdomProf"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:gravity="center"
                    android:text="@string/WisdomProf"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/religion" />

                <CheckBox
                    android:id="@+id/animalHandling"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/AnimHand"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/wisdomProf" />

                <CheckBox
                    android:id="@+id/insight"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Insight"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/animalHandling" />

                <CheckBox
                    android:id="@+id/medicine"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Meds"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/insight" />

                <CheckBox
                    android:id="@+id/perception"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Percep"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/medicine" />

                <CheckBox
                    android:id="@+id/survival"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Survival"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/perception" />

                <TextView
                    android:id="@+id/charismaProf"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:gravity="center"
                    android:text="@string/CharProf"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/survival" />

                <CheckBox
                    android:id="@+id/deception"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Deception"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/charismaProf" />

                <CheckBox
                    android:id="@+id/intimidation"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Intimid"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/deception" />

                <CheckBox
                    android:id="@+id/performance"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Performance"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/intimidation" />

                <CheckBox
                    android:id="@+id/persuasion"
                    android:layout_width="368dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/Persuasion"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/performance" />

                <Button
                    android:id="@+id/saveButton"
                    android:layout_width="wrap_content"
                    android:layout_height="50dp"
                    android:layout_marginEnd="8dp"
                    android:layout_marginStart="8dp"
                    android:layout_marginTop="8dp"
                    android:text="@string/save"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />

            </TableLayout>

        </RelativeLayout>

    </ScrollView>

</android.support.constraint.ConstraintLayout>
