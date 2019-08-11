package fr.neutronstars.sands_city.api.sql;

import java.lang.annotation.*;

/**
 * Cette annotation sert a indiquer a sql comment sauvegarder ou charger les donnée d'un objet.
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ISave
{
    /**
     * La colonne cible de la variable. Si ignorer alors la nom de la variable sera pris en compte.
     * @return
     */
    String column() default "";

    boolean callToString() default false;
}
