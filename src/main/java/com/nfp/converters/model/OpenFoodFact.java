package com.nfp.converters.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class OpenFoodFact {
    @Id
    String code;
    @Column(columnDefinition="text")
    String url;
    String creator;
    String created_t;
    String created_datetime;
    String last_modified_t;
    String last_modified_datetime;
    @Column(columnDefinition="text")
    String product_name;
    @Column(columnDefinition="text")
    String generic_name;
    String quantity;
    @Column(columnDefinition="text")
    String packaging;
    @Column(columnDefinition="text")
    String packaging_tags;
    @Column(columnDefinition="text")
    String packaging_text;
    @Column(columnDefinition="text")
    String brands;
    @Column(columnDefinition="text")
    String brands_tags;
    @Column(columnDefinition="text")
    String categories;
    @Column(columnDefinition="text")
    String categories_tags;
    @Column(columnDefinition="text")
    String categories_en;
    @Column(columnDefinition="text")
    String origins;
    @Column(columnDefinition="text")
    String origins_tags;
    @Column(columnDefinition="text")
    String origins_en;
    @Column(columnDefinition="text")
    String manufacturing_places;
    @Column(columnDefinition="text")
    String manufacturing_places_tags;
    @Column(columnDefinition="text")
    String labels;
    @Column(columnDefinition="text")
    String labels_tags;
    @Column(columnDefinition="text")
    String labels_en;
    @Column(columnDefinition="text")
    String emb_codes;
    @Column(columnDefinition="text")
    String emb_codes_tags;
    String first_packaging_code_geo;
    @Column(columnDefinition="text")
    String cities;
    @Column(columnDefinition="text")
    String cities_tags;
    @Column(columnDefinition="text")
    String purchase_places;
    @Column(columnDefinition="text")
    String stores;
    @Column(columnDefinition="text")
    String countries;
    @Column(columnDefinition="text")
    String countries_tags;
    @Column(columnDefinition="text")
    String countries_en;
    @Column(columnDefinition="text")
    String ingredients_text;
    @Column(columnDefinition="text")
    String allergens;
    @Column(columnDefinition="text")
    String allergens_en;
    @Column(columnDefinition="text")
    String traces;
    @Column(columnDefinition="text")
    String traces_tags;
    @Column(columnDefinition="text")
    String traces_en;
    String serving_size;
    String serving_quantity;
    String no_nutriments;
    @Column(columnDefinition="text")
    String additives_n;
    @Column(columnDefinition="text")
    String additives;
    @Column(columnDefinition="text")
    String additives_tags;
    @Column(columnDefinition="text")
    String additives_en;
    @Column(columnDefinition="text")
    String ingredients_from_palm_oil_n;
    @Column(columnDefinition="text")
    String ingredients_from_palm_oil;
    @Column(columnDefinition="text")
    String ingredients_from_palm_oil_tags;
    @Column(columnDefinition="text")
    String ingredients_that_may_be_from_palm_oil_n;
    @Column(columnDefinition="text")
    String ingredients_that_may_be_from_palm_oil;
    @Column(columnDefinition="text")
    String ingredients_that_may_be_from_palm_oil_tags;
    String nutriscore_score;
    String nutriscore_grade;
    String nova_group;
    String pnns_groups_1;
    String pnns_groups_2;
    @Column(columnDefinition="text")
    String states;
    @Column(columnDefinition="text")
    String states_tags;
    @Column(columnDefinition="text")
    String states_en;
    String brand_owner;
    @Column(columnDefinition="text")
    String main_category;
    @Column(columnDefinition="text")
    String main_category_en;
    @Column(columnDefinition="text")
    String image_url;
    @Column(columnDefinition="text")
    String image_small_url;
    @Column(columnDefinition="text")
    String image_ingredients_url;
    @Column(columnDefinition="text")
    String image_ingredients_small_url;
    @Column(columnDefinition="text")
    String image_nutrition_url;
    @Column(columnDefinition="text")
    String image_nutrition_small_url;
    Double energy_kj_100g;
    Double energy_kcal_100g;
    Double energy_100g;
    Double energy_from_fat_100g;
    Double fat_100g;
    Double saturated_fat_100g;
    Double _butyric_acid_100g;
    Double _caproic_acid_100g;
    Double _caprylic_acid_100g;
    Double _capric_acid_100g;
    Double _lauric_acid_100g;
    Double _myristic_acid_100g;
    Double _palmitic_acid_100g;
    Double _stearic_acid_100g;
    Double _arachidic_acid_100g;
    Double _behenic_acid_100g;
    Double _lignoceric_acid_100g;
    Double _cerotic_acid_100g;
    Double _montanic_acid_100g;
    Double _melissic_acid_100g;
    Double monounsaturated_fat_100g;
    Double polyunsaturated_fat_100g;
    Double omega_3_fat_100g;
    Double _alpha_linolenic_acid_100g;
    Double _eicosapentaenoic_acid_100g;
    Double _docosahexaenoic_acid_100g;
    Double omega_6_fat_100g;
    Double _linoleic_acid_100g;
    Double _arachidonic_acid_100g;
    Double _gamma_linolenic_acid_100g;
    Double _dihomo_gamma_linolenic_acid_100g;
    Double omega_9_fat_100g;
    Double _oleic_acid_100g;
    Double _elaidic_acid_100g;
    Double _gondoic_acid_100g;
    Double _mead_acid_100g;
    Double _erucic_acid_100g;
    Double _nervonic_acid_100g;
    Double trans_fat_100g;
    Double cholesterol_100g;
    Double carbohydrates_100g;
    Double sugars_100g;
    Double _sucrose_100g;
    Double _glucose_100g;
    Double _fructose_100g;
    Double _lactose_100g;
    Double _maltose_100g;
    Double _maltodextrins_100g;
    Double starch_100g;
    Double polyols_100g;
    Double fiber_100g;
    Double _soluble_fiber_100g;
    Double _insoluble_fiber_100g;
    Double proteins_100g;
    Double casein_100g;
    Double serum_proteins_100g;
    Double nucleotides_100g;
    Double salt_100g;
    Double sodium_100g;
    Double alcohol_100g;
    Double vitamin_a_100g;
    Double beta_carotene_100g;
    Double vitamin_d_100g;
    Double vitamin_e_100g;
    Double vitamin_k_100g;
    Double vitamin_c_100g;
    Double vitamin_b1_100g;
    Double vitamin_b2_100g;
    Double vitamin_pp_100g;
    Double vitamin_b6_100g;
    Double vitamin_b9_100g;
    Double folates_100g;
    Double vitamin_b12_100g;
    Double biotin_100g;
    Double pantothenic_acid_100g;
    Double silica_100g;
    Double bicarbonate_100g;
    Double potassium_100g;
    Double chloride_100g;
    Double calcium_100g;
    Double phosphorus_100g;
    Double iron_100g;
    Double magnesium_100g;
    Double zinc_100g;
    Double copper_100g;
    Double manganese_100g;
    Double fluoride_100g;
    Double selenium_100g;
    Double chromium_100g;
    Double molybdenum_100g;
    Double iodine_100g;
    Double caffeine_100g;
    Double taurine_100g;
    Double ph_100g;
    Double fruits_vegetables_nuts_100g;
    Double fruits_vegetables_nuts_dried_100g;
    Double fruits_vegetables_nuts_estimate_100g;
    Double collagen_meat_protein_ratio_100g;
    Double cocoa_100g;
    Double chlorophyl_100g;
    Double carbon_footprint_100g;
    Double carbon_footprint_from_meat_or_fish_100g;
    String nutrition_score_fr_100g;
    String nutrition_score_uk_100g;
    Double glycemic_index_100g;
    Double water_hardness_100g;
    Double choline_100g;
    Double phylloquinone_100g;
    Double beta_glucan_100g;
    Double inositol_100g;
    Double carnitine_100g;

    @Override
    public String toString() {
        return "OpenFoodFact{" +
                "code='" + code + '\'' +
                ", url='" + url + '\'' +
                ", creator='" + creator + '\'' +
                ", created_t='" + created_t + '\'' +
                ", created_datetime='" + created_datetime + '\'' +
                ", last_modified_t='" + last_modified_t + '\'' +
                ", last_modified_datetime='" + last_modified_datetime + '\'' +
                ", product_name='" + product_name + '\'' +
                ", generic_name='" + generic_name + '\'' +
                ", quantity='" + quantity + '\'' +
                ", packaging='" + packaging + '\'' +
                ", packaging_tags='" + packaging_tags + '\'' +
                ", packaging_text='" + packaging_text + '\'' +
                ", brands='" + brands + '\'' +
                ", brands_tags='" + brands_tags + '\'' +
                ", categories='" + categories + '\'' +
                ", categories_tags='" + categories_tags + '\'' +
                ", categories_en='" + categories_en + '\'' +
                ", origins='" + origins + '\'' +
                ", origins_tags='" + origins_tags + '\'' +
                ", origins_en='" + origins_en + '\'' +
                ", manufacturing_places='" + manufacturing_places + '\'' +
                ", manufacturing_places_tags='" + manufacturing_places_tags + '\'' +
                ", labels='" + labels + '\'' +
                ", labels_tags='" + labels_tags + '\'' +
                ", labels_en='" + labels_en + '\'' +
                ", emb_codes='" + emb_codes + '\'' +
                ", emb_codes_tags='" + emb_codes_tags + '\'' +
                ", first_packaging_code_geo='" + first_packaging_code_geo + '\'' +
                ", cities='" + cities + '\'' +
                ", cities_tags='" + cities_tags + '\'' +
                ", purchase_places='" + purchase_places + '\'' +
                ", stores='" + stores + '\'' +
                ", countries='" + countries + '\'' +
                ", countries_tags='" + countries_tags + '\'' +
                ", countries_en='" + countries_en + '\'' +
                ", ingredients_text='" + ingredients_text + '\'' +
                ", allergens='" + allergens + '\'' +
                ", allergens_en='" + allergens_en + '\'' +
                ", traces='" + traces + '\'' +
                ", traces_tags='" + traces_tags + '\'' +
                ", traces_en='" + traces_en + '\'' +
                ", serving_size='" + serving_size + '\'' +
                ", serving_quantity='" + serving_quantity + '\'' +
                ", no_nutriments='" + no_nutriments + '\'' +
                ", additives_n='" + additives_n + '\'' +
                ", additives='" + additives + '\'' +
                ", additives_tags='" + additives_tags + '\'' +
                ", additives_en='" + additives_en + '\'' +
                ", ingredients_from_palm_oil_n='" + ingredients_from_palm_oil_n + '\'' +
                ", ingredients_from_palm_oil='" + ingredients_from_palm_oil + '\'' +
                ", ingredients_from_palm_oil_tags='" + ingredients_from_palm_oil_tags + '\'' +
                ", ingredients_that_may_be_from_palm_oil_n='" + ingredients_that_may_be_from_palm_oil_n + '\'' +
                ", ingredients_that_may_be_from_palm_oil='" + ingredients_that_may_be_from_palm_oil + '\'' +
                ", ingredients_that_may_be_from_palm_oil_tags='" + ingredients_that_may_be_from_palm_oil_tags + '\'' +
                ", nutriscore_score='" + nutriscore_score + '\'' +
                ", nutriscore_grade='" + nutriscore_grade + '\'' +
                ", nova_group='" + nova_group + '\'' +
                ", pnns_groups_1='" + pnns_groups_1 + '\'' +
                ", pnns_groups_2='" + pnns_groups_2 + '\'' +
                ", states='" + states + '\'' +
                ", states_tags='" + states_tags + '\'' +
                ", states_en='" + states_en + '\'' +
                ", brand_owner='" + brand_owner + '\'' +
                ", main_category='" + main_category + '\'' +
                ", main_category_en='" + main_category_en + '\'' +
                ", image_url='" + image_url + '\'' +
                ", image_small_url='" + image_small_url + '\'' +
                ", image_ingredients_url='" + image_ingredients_url + '\'' +
                ", image_ingredients_small_url='" + image_ingredients_small_url + '\'' +
                ", image_nutrition_url='" + image_nutrition_url + '\'' +
                ", image_nutrition_small_url='" + image_nutrition_small_url + '\'' +
                ", energy_kj_100g='" + energy_kj_100g + '\'' +
                ", energy_kcal_100g='" + energy_kcal_100g + '\'' +
                ", energy_100g='" + energy_100g + '\'' +
                ", energy_from_fat_100g='" + energy_from_fat_100g + '\'' +
                ", fat_100g='" + fat_100g + '\'' +
                ", saturated_fat_100g='" + saturated_fat_100g + '\'' +
                ", _butyric_acid_100g='" + _butyric_acid_100g + '\'' +
                ", _caproic_acid_100g='" + _caproic_acid_100g + '\'' +
                ", _caprylic_acid_100g='" + _caprylic_acid_100g + '\'' +
                ", _capric_acid_100g='" + _capric_acid_100g + '\'' +
                ", _lauric_acid_100g='" + _lauric_acid_100g + '\'' +
                ", _myristic_acid_100g='" + _myristic_acid_100g + '\'' +
                ", _palmitic_acid_100g='" + _palmitic_acid_100g + '\'' +
                ", _stearic_acid_100g='" + _stearic_acid_100g + '\'' +
                ", _arachidic_acid_100g='" + _arachidic_acid_100g + '\'' +
                ", _behenic_acid_100g='" + _behenic_acid_100g + '\'' +
                ", _lignoceric_acid_100g='" + _lignoceric_acid_100g + '\'' +
                ", _cerotic_acid_100g='" + _cerotic_acid_100g + '\'' +
                ", _montanic_acid_100g='" + _montanic_acid_100g + '\'' +
                ", _melissic_acid_100g='" + _melissic_acid_100g + '\'' +
                ", monounsaturated_fat_100g='" + monounsaturated_fat_100g + '\'' +
                ", polyunsaturated_fat_100g='" + polyunsaturated_fat_100g + '\'' +
                ", omega_3_fat_100g='" + omega_3_fat_100g + '\'' +
                ", _alpha_linolenic_acid_100g='" + _alpha_linolenic_acid_100g + '\'' +
                ", _eicosapentaenoic_acid_100g='" + _eicosapentaenoic_acid_100g + '\'' +
                ", _docosahexaenoic_acid_100g='" + _docosahexaenoic_acid_100g + '\'' +
                ", omega_6_fat_100g='" + omega_6_fat_100g + '\'' +
                ", _linoleic_acid_100g='" + _linoleic_acid_100g + '\'' +
                ", _arachidonic_acid_100g='" + _arachidonic_acid_100g + '\'' +
                ", _gamma_linolenic_acid_100g='" + _gamma_linolenic_acid_100g + '\'' +
                ", _dihomo_gamma_linolenic_acid_100g='" + _dihomo_gamma_linolenic_acid_100g + '\'' +
                ", omega_9_fat_100g='" + omega_9_fat_100g + '\'' +
                ", _oleic_acid_100g='" + _oleic_acid_100g + '\'' +
                ", _elaidic_acid_100g='" + _elaidic_acid_100g + '\'' +
                ", _gondoic_acid_100g='" + _gondoic_acid_100g + '\'' +
                ", _mead_acid_100g='" + _mead_acid_100g + '\'' +
                ", _erucic_acid_100g='" + _erucic_acid_100g + '\'' +
                ", _nervonic_acid_100g='" + _nervonic_acid_100g + '\'' +
                ", trans_fat_100g='" + trans_fat_100g + '\'' +
                ", cholesterol_100g='" + cholesterol_100g + '\'' +
                ", carbohydrates_100g='" + carbohydrates_100g + '\'' +
                ", sugars_100g='" + sugars_100g + '\'' +
                ", _sucrose_100g='" + _sucrose_100g + '\'' +
                ", _glucose_100g='" + _glucose_100g + '\'' +
                ", _fructose_100g='" + _fructose_100g + '\'' +
                ", _lactose_100g='" + _lactose_100g + '\'' +
                ", _maltose_100g='" + _maltose_100g + '\'' +
                ", _maltodextrins_100g='" + _maltodextrins_100g + '\'' +
                ", starch_100g='" + starch_100g + '\'' +
                ", polyols_100g='" + polyols_100g + '\'' +
                ", fiber_100g='" + fiber_100g + '\'' +
                ", _soluble_fiber_100g='" + _soluble_fiber_100g + '\'' +
                ", _insoluble_fiber_100g='" + _insoluble_fiber_100g + '\'' +
                ", proteins_100g='" + proteins_100g + '\'' +
                ", casein_100g='" + casein_100g + '\'' +
                ", serum_proteins_100g='" + serum_proteins_100g + '\'' +
                ", nucleotides_100g='" + nucleotides_100g + '\'' +
                ", salt_100g='" + salt_100g + '\'' +
                ", sodium_100g='" + sodium_100g + '\'' +
                ", alcohol_100g='" + alcohol_100g + '\'' +
                ", vitamin_a_100g='" + vitamin_a_100g + '\'' +
                ", beta_carotene_100g='" + beta_carotene_100g + '\'' +
                ", vitamin_d_100g='" + vitamin_d_100g + '\'' +
                ", vitamin_e_100g='" + vitamin_e_100g + '\'' +
                ", vitamin_k_100g='" + vitamin_k_100g + '\'' +
                ", vitamin_c_100g='" + vitamin_c_100g + '\'' +
                ", vitamin_b1_100g='" + vitamin_b1_100g + '\'' +
                ", vitamin_b2_100g='" + vitamin_b2_100g + '\'' +
                ", vitamin_pp_100g='" + vitamin_pp_100g + '\'' +
                ", vitamin_b6_100g='" + vitamin_b6_100g + '\'' +
                ", vitamin_b9_100g='" + vitamin_b9_100g + '\'' +
                ", folates_100g='" + folates_100g + '\'' +
                ", vitamin_b12_100g='" + vitamin_b12_100g + '\'' +
                ", biotin_100g='" + biotin_100g + '\'' +
                ", pantothenic_acid_100g='" + pantothenic_acid_100g + '\'' +
                ", silica_100g='" + silica_100g + '\'' +
                ", bicarbonate_100g='" + bicarbonate_100g + '\'' +
                ", potassium_100g='" + potassium_100g + '\'' +
                ", chloride_100g='" + chloride_100g + '\'' +
                ", calcium_100g='" + calcium_100g + '\'' +
                ", phosphorus_100g='" + phosphorus_100g + '\'' +
                ", iron_100g='" + iron_100g + '\'' +
                ", magnesium_100g='" + magnesium_100g + '\'' +
                ", zinc_100g='" + zinc_100g + '\'' +
                ", copper_100g='" + copper_100g + '\'' +
                ", manganese_100g='" + manganese_100g + '\'' +
                ", fluoride_100g='" + fluoride_100g + '\'' +
                ", selenium_100g='" + selenium_100g + '\'' +
                ", chromium_100g='" + chromium_100g + '\'' +
                ", molybdenum_100g='" + molybdenum_100g + '\'' +
                ", iodine_100g='" + iodine_100g + '\'' +
                ", caffeine_100g='" + caffeine_100g + '\'' +
                ", taurine_100g='" + taurine_100g + '\'' +
                ", ph_100g='" + ph_100g + '\'' +
                ", fruits_vegetables_nuts_100g='" + fruits_vegetables_nuts_100g + '\'' +
                ", fruits_vegetables_nuts_dried_100g='" + fruits_vegetables_nuts_dried_100g + '\'' +
                ", fruits_vegetables_nuts_estimate_100g='" + fruits_vegetables_nuts_estimate_100g + '\'' +
                ", collagen_meat_protein_ratio_100g='" + collagen_meat_protein_ratio_100g + '\'' +
                ", cocoa_100g='" + cocoa_100g + '\'' +
                ", chlorophyl_100g='" + chlorophyl_100g + '\'' +
                ", carbon_footprint_100g='" + carbon_footprint_100g + '\'' +
                ", carbon_footprint_from_meat_or_fish_100g='" + carbon_footprint_from_meat_or_fish_100g + '\'' +
                ", nutrition_score_fr_100g='" + nutrition_score_fr_100g + '\'' +
                ", nutrition_score_uk_100g='" + nutrition_score_uk_100g + '\'' +
                ", glycemic_index_100g='" + glycemic_index_100g + '\'' +
                ", water_hardness_100g='" + water_hardness_100g + '\'' +
                ", choline_100g='" + choline_100g + '\'' +
                ", phylloquinone_100g='" + phylloquinone_100g + '\'' +
                ", beta_glucan_100g='" + beta_glucan_100g + '\'' +
                ", inositol_100g='" + inositol_100g + '\'' +
                ", carnitine_100g='" + carnitine_100g + '\'' +
                '}';
    }
}