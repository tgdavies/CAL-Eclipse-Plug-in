/*******************************************************************************
 * Copyright (c) 2006 Business Objects Software Limited and others.
 * All rights reserved. 
 * This file is made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Business Objects Software Limited - initial API and implementation based on Eclipse 3.1.2 code for
 *                             /org.eclipse.jdt.core/formatter/org/eclipse/jdt/internal/formatter/DefaultCodeFormatterOptions.java
 *                           Eclipse source is available at: http://www.eclipse.org/downloads/
 *******************************************************************************/

/*
 * DefaultCodeFormatterOptions.java
 * Creation date: Feb 14, 2006.
 * By: Edward Lam
 */
package org.openquark.cal.eclipse.core.formatter;

import java.util.HashMap;
import java.util.Map;

import org.openquark.cal.eclipse.core.CoreOptionIDs;
import org.openquark.cal.eclipse.core.formatter.align.Alignment;


/**
 * Default options for the code formatter.
 * This is still subject to changes before 3.0.
 * @author Edward Lam
 */
public class DefaultCodeFormatterOptions {
    public static final int TAB = 1;
    public static final int SPACE = 2;
    public static final int MIXED = 4;
    
    public static DefaultCodeFormatterOptions getDefaultSettings() {
        DefaultCodeFormatterOptions options = new DefaultCodeFormatterOptions();
        options.setDefaultSettings();
        return options;
    }
    
    public int alignment_for_arguments_in_allocation_expression;
    public int alignment_for_arguments_in_enum_constant;
    public int alignment_for_arguments_in_explicit_constructor_call;
    public int alignment_for_arguments_in_method_invocation;
    public int alignment_for_arguments_in_qualified_allocation_expression;
    public int alignment_for_binary_expression;
    public int alignment_for_compact_if;
    public int alignment_for_conditional_expression;
    public int alignment_for_enum_constants;
    public int alignment_for_expressions_in_array_initializer;
    public int alignment_for_multiple_fields;
    public int alignment_for_parameters_in_constructor_declaration;
    public int alignment_for_parameters_in_method_declaration;
    public int alignment_for_selector_in_method_invocation;
    public int alignment_for_superclass_in_type_declaration;
    public int alignment_for_superinterfaces_in_enum_declaration;
    public int alignment_for_superinterfaces_in_type_declaration;
    public int alignment_for_throws_clause_in_constructor_declaration;
    public int alignment_for_throws_clause_in_method_declaration;
    
    public boolean align_type_members_on_columns;
    
    public String brace_position_for_annotation_type_declaration;
    public String brace_position_for_anonymous_type_declaration;
    public String brace_position_for_array_initializer;
    public String brace_position_for_block;
    public String brace_position_for_block_in_case;
    public String brace_position_for_constructor_declaration;
    public String brace_position_for_enum_constant;
    public String brace_position_for_enum_declaration;
    public String brace_position_for_method_declaration;
    public String brace_position_for_type_declaration;
    public String brace_position_for_switch;
    
    public int continuation_indentation;
    public int continuation_indentation_for_array_initializer;
    
    public int blank_lines_after_imports;
    public int blank_lines_after_package;
    public int blank_lines_before_field;
    public int blank_lines_before_first_class_body_declaration;
    public int blank_lines_before_imports;
    public int blank_lines_before_member_type;
    public int blank_lines_before_method;
    public int blank_lines_before_new_chunk;
    public int blank_lines_before_package;
    public int blank_lines_between_type_declarations;
    public int blank_lines_at_beginning_of_method_body;
    
    public boolean comment_clear_blank_lines;
    public boolean comment_format;
    public boolean comment_format_header;
    public boolean comment_format_html;
    public boolean comment_format_source;
    public boolean comment_indent_parameter_description;
    public boolean comment_indent_root_tags;
    public boolean comment_insert_empty_line_before_root_tags;
    public boolean comment_insert_new_line_for_parameter;
    public int comment_line_length;
    
    public boolean indent_statements_compare_to_block;
    public boolean indent_statements_compare_to_body;
    public boolean indent_body_declarations_compare_to_enum_constant_header;
    public boolean indent_body_declarations_compare_to_enum_declaration_header;
    public boolean indent_body_declarations_compare_to_type_header;
    public boolean indent_breaks_compare_to_cases;
    public boolean indent_switchstatements_compare_to_cases;
    public boolean indent_switchstatements_compare_to_switch;
    public int indentation_size;
    
    public boolean insert_new_line_after_annotation;
    public boolean insert_new_line_after_opening_brace_in_array_initializer;
    public boolean insert_new_line_at_end_of_file_if_missing;
    public boolean insert_new_line_before_catch_in_try_statement;
    public boolean insert_new_line_before_closing_brace_in_array_initializer;
    public boolean insert_new_line_before_else_in_if_statement;
    public boolean insert_new_line_before_finally_in_try_statement;
    public boolean insert_new_line_before_while_in_do_statement;
    public boolean insert_new_line_in_empty_anonymous_type_declaration;
    public boolean insert_new_line_in_empty_block;
    public boolean insert_new_line_in_empty_enum_constant;
    public boolean insert_new_line_in_empty_enum_declaration;
    public boolean insert_new_line_in_empty_method_body;
    public boolean insert_new_line_in_empty_type_declaration;
    public boolean insert_space_after_and_in_type_parameter;
    public boolean insert_space_after_assignment_operator;
    public boolean insert_space_after_at_in_annotation;
    public boolean insert_space_after_at_in_annotation_type_declaration;
    public boolean insert_space_after_binary_operator;
    public boolean insert_space_after_closing_angle_bracket_in_type_arguments;
    public boolean insert_space_after_closing_angle_bracket_in_type_parameters;
    public boolean insert_space_after_closing_paren_in_cast;
    public boolean insert_space_after_closing_brace_in_block;
    public boolean insert_space_after_colon_in_assert;
    public boolean insert_space_after_colon_in_case;
    public boolean insert_space_after_colon_in_conditional;
    public boolean insert_space_after_colon_in_for;
    public boolean insert_space_after_colon_in_labeled_statement;
    public boolean insert_space_after_comma_in_allocation_expression;
    public boolean insert_space_after_comma_in_annotation;
    public boolean insert_space_after_comma_in_array_initializer;
    public boolean insert_space_after_comma_in_constructor_declaration_parameters;
    public boolean insert_space_after_comma_in_constructor_declaration_throws;
    public boolean insert_space_after_comma_in_enum_constant_arguments;
    public boolean insert_space_after_comma_in_enum_declarations;
    public boolean insert_space_after_comma_in_explicit_constructor_call_arguments;
    public boolean insert_space_after_comma_in_for_increments;
    public boolean insert_space_after_comma_in_for_inits;
    public boolean insert_space_after_comma_in_method_invocation_arguments;
    public boolean insert_space_after_comma_in_method_declaration_parameters;
    public boolean insert_space_after_comma_in_method_declaration_throws;
    public boolean insert_space_after_comma_in_multiple_field_declarations;
    public boolean insert_space_after_comma_in_multiple_local_declarations;
    public boolean insert_space_after_comma_in_parameterized_type_reference;
    public boolean insert_space_after_comma_in_superinterfaces;
    public boolean insert_space_after_comma_in_type_arguments;
    public boolean insert_space_after_comma_in_type_parameters;
    public boolean insert_space_after_ellipsis;
    public boolean insert_space_after_opening_angle_bracket_in_parameterized_type_reference;
    public boolean insert_space_after_opening_angle_bracket_in_type_arguments;
    public boolean insert_space_after_opening_angle_bracket_in_type_parameters;
    public boolean insert_space_after_opening_bracket_in_array_allocation_expression;
    public boolean insert_space_after_opening_bracket_in_array_reference;
    public boolean insert_space_after_opening_brace_in_array_initializer;
    public boolean insert_space_after_opening_paren_in_annotation;
    public boolean insert_space_after_opening_paren_in_cast;
    public boolean insert_space_after_opening_paren_in_catch;
    public boolean insert_space_after_opening_paren_in_constructor_declaration;
    public boolean insert_space_after_opening_paren_in_enum_constant;
    public boolean insert_space_after_opening_paren_in_for;
    public boolean insert_space_after_opening_paren_in_if;
    public boolean insert_space_after_opening_paren_in_method_declaration;
    public boolean insert_space_after_opening_paren_in_method_invocation;
    public boolean insert_space_after_opening_paren_in_parenthesized_expression;
    public boolean insert_space_after_opening_paren_in_switch;
    public boolean insert_space_after_opening_paren_in_synchronized;
    public boolean insert_space_after_opening_paren_in_while;
    public boolean insert_space_after_postfix_operator;
    public boolean insert_space_after_prefix_operator;
    public boolean insert_space_after_question_in_conditional;
    public boolean insert_space_after_question_in_wilcard;
    public boolean insert_space_after_semicolon_in_for;
    public boolean insert_space_after_unary_operator;
    public boolean insert_space_before_and_in_type_parameter;
    public boolean insert_space_before_at_in_annotation_type_declaration;
    public boolean insert_space_before_assignment_operator;
    public boolean insert_space_before_binary_operator;
    public boolean insert_space_before_closing_angle_bracket_in_parameterized_type_reference;
    public boolean insert_space_before_closing_angle_bracket_in_type_arguments;
    public boolean insert_space_before_closing_angle_bracket_in_type_parameters;
    public boolean insert_space_before_closing_brace_in_array_initializer;
    public boolean insert_space_before_closing_bracket_in_array_allocation_expression;
    public boolean insert_space_before_closing_bracket_in_array_reference;
    public boolean insert_space_before_closing_paren_in_annotation;
    public boolean insert_space_before_closing_paren_in_cast;
    public boolean insert_space_before_closing_paren_in_catch;
    public boolean insert_space_before_closing_paren_in_constructor_declaration;
    public boolean insert_space_before_closing_paren_in_enum_constant;
    public boolean insert_space_before_closing_paren_in_for;
    public boolean insert_space_before_closing_paren_in_if;
    public boolean insert_space_before_closing_paren_in_method_declaration;
    public boolean insert_space_before_closing_paren_in_method_invocation;
    public boolean insert_space_before_closing_paren_in_parenthesized_expression;
    public boolean insert_space_before_closing_paren_in_switch;
    public boolean insert_space_before_closing_paren_in_synchronized;
    public boolean insert_space_before_closing_paren_in_while;
    public boolean insert_space_before_colon_in_assert;
    public boolean insert_space_before_colon_in_case;
    public boolean insert_space_before_colon_in_conditional;
    public boolean insert_space_before_colon_in_default;
    public boolean insert_space_before_colon_in_for;
    public boolean insert_space_before_colon_in_labeled_statement;
    public boolean insert_space_before_comma_in_allocation_expression;
    public boolean insert_space_before_comma_in_annotation;
    public boolean insert_space_before_comma_in_array_initializer;
    public boolean insert_space_before_comma_in_constructor_declaration_parameters;
    public boolean insert_space_before_comma_in_constructor_declaration_throws;
    public boolean insert_space_before_comma_in_enum_constant_arguments;
    public boolean insert_space_before_comma_in_enum_declarations;
    public boolean insert_space_before_comma_in_explicit_constructor_call_arguments;
    public boolean insert_space_before_comma_in_for_increments;
    public boolean insert_space_before_comma_in_for_inits;
    public boolean insert_space_before_comma_in_method_invocation_arguments;
    public boolean insert_space_before_comma_in_method_declaration_parameters;
    public boolean insert_space_before_comma_in_method_declaration_throws;
    public boolean insert_space_before_comma_in_multiple_field_declarations;
    public boolean insert_space_before_comma_in_multiple_local_declarations;
    public boolean insert_space_before_comma_in_parameterized_type_reference;
    public boolean insert_space_before_comma_in_superinterfaces;
    public boolean insert_space_before_comma_in_type_arguments;
    public boolean insert_space_before_comma_in_type_parameters;
    public boolean insert_space_before_ellipsis;
    public boolean insert_space_before_question_in_wilcard;
    public boolean insert_space_before_opening_angle_bracket_in_parameterized_type_reference;
    public boolean insert_space_before_opening_angle_bracket_in_type_arguments;
    public boolean insert_space_before_opening_angle_bracket_in_type_parameters;
    public boolean insert_space_before_opening_brace_in_annotation_type_declaration;
    public boolean insert_space_before_opening_brace_in_anonymous_type_declaration;
    public boolean insert_space_before_opening_brace_in_array_initializer;
    public boolean insert_space_before_opening_brace_in_block;
    public boolean insert_space_before_opening_brace_in_constructor_declaration;
    public boolean insert_space_before_opening_brace_in_enum_constant;
    public boolean insert_space_before_opening_brace_in_enum_declaration;
    public boolean insert_space_before_opening_brace_in_method_declaration;
    public boolean insert_space_before_opening_brace_in_type_declaration;
    public boolean insert_space_before_opening_bracket_in_array_allocation_expression;
    public boolean insert_space_before_opening_bracket_in_array_reference;
    public boolean insert_space_before_opening_bracket_in_array_type_reference;
    public boolean insert_space_before_opening_paren_in_annotation;
    public boolean insert_space_before_opening_paren_in_annotation_type_member_declaration;
    public boolean insert_space_before_opening_paren_in_catch;
    public boolean insert_space_before_opening_paren_in_constructor_declaration;
    public boolean insert_space_before_opening_paren_in_enum_constant;
    public boolean insert_space_before_opening_paren_in_for;
    public boolean insert_space_before_opening_paren_in_if;
    public boolean insert_space_before_opening_paren_in_method_invocation;
    public boolean insert_space_before_opening_paren_in_method_declaration;
    public boolean insert_space_before_opening_paren_in_switch;
    public boolean insert_space_before_opening_brace_in_switch;
    public boolean insert_space_before_opening_paren_in_synchronized;
    public boolean insert_space_before_opening_paren_in_parenthesized_expression;
    public boolean insert_space_before_opening_paren_in_while;
    public boolean insert_space_before_postfix_operator;
    public boolean insert_space_before_prefix_operator;
    public boolean insert_space_before_question_in_conditional;
    public boolean insert_space_before_semicolon;
    public boolean insert_space_before_semicolon_in_for;
    public boolean insert_space_before_unary_operator;
    public boolean insert_space_between_brackets_in_array_type_reference;
    public boolean insert_space_between_empty_braces_in_array_initializer;
    public boolean insert_space_between_empty_brackets_in_array_allocation_expression;
    public boolean insert_space_between_empty_parens_in_annotation_type_member_declaration;
    public boolean insert_space_between_empty_parens_in_constructor_declaration;
    public boolean insert_space_between_empty_parens_in_enum_constant;
    public boolean insert_space_between_empty_parens_in_method_declaration;
    public boolean insert_space_between_empty_parens_in_method_invocation;
    public boolean compact_else_if;
    public boolean keep_guardian_clause_on_one_line;
    public boolean keep_else_statement_on_same_line;
    public boolean keep_empty_array_initializer_on_one_line;
    public boolean keep_simple_if_on_one_line;
    public boolean keep_then_statement_on_same_line;
    public int number_of_empty_lines_to_preserve;
    public boolean put_empty_statement_on_new_line;
    public int tab_size;
    public final char filling_space = ' ';
    public int page_width;
    public int tab_char;
    public boolean use_tabs_only_for_leading_indentations;
    
    public int initial_indentation_level;
    public String line_separator;
    
    private DefaultCodeFormatterOptions() {
        // cannot be instantiated
    }
    
    public DefaultCodeFormatterOptions(Map<String, String> settings) {
        setDefaultSettings();
        if (settings == null) {
            return;
        }
        set(settings);
    }
    
    private String getAlignment(int alignment) {
        return Integer.toString(alignment);
    }
    
    public Map<String, String> getMap() {
        Map<String, String> options = new HashMap<String, String>();
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_ALLOCATION_EXPRESSION, getAlignment(this.alignment_for_arguments_in_allocation_expression));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_ENUM_CONSTANT, getAlignment(this.alignment_for_arguments_in_enum_constant));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_EXPLICIT_CONSTRUCTOR_CALL, getAlignment(this.alignment_for_arguments_in_explicit_constructor_call));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_METHOD_INVOCATION, getAlignment(this.alignment_for_arguments_in_method_invocation));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_QUALIFIED_ALLOCATION_EXPRESSION, getAlignment(this.alignment_for_arguments_in_qualified_allocation_expression));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_BINARY_EXPRESSION, getAlignment(this.alignment_for_binary_expression));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_COMPACT_IF, getAlignment(this.alignment_for_compact_if));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_CONDITIONAL_EXPRESSION, getAlignment(this.alignment_for_conditional_expression));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ENUM_CONSTANTS, getAlignment(this.alignment_for_enum_constants));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_EXPRESSIONS_IN_ARRAY_INITIALIZER, getAlignment(this.alignment_for_expressions_in_array_initializer));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_MULTIPLE_FIELDS, getAlignment(this.alignment_for_multiple_fields));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_PARAMETERS_IN_CONSTRUCTOR_DECLARATION, getAlignment(this.alignment_for_parameters_in_constructor_declaration));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_PARAMETERS_IN_METHOD_DECLARATION, getAlignment(this.alignment_for_parameters_in_method_declaration));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_SELECTOR_IN_METHOD_INVOCATION, getAlignment(this.alignment_for_selector_in_method_invocation));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_SUPERCLASS_IN_TYPE_DECLARATION, getAlignment(this.alignment_for_superclass_in_type_declaration));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_SUPERINTERFACES_IN_ENUM_DECLARATION, getAlignment(this.alignment_for_superinterfaces_in_enum_declaration));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_SUPERINTERFACES_IN_TYPE_DECLARATION, getAlignment(this.alignment_for_superinterfaces_in_type_declaration));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_THROWS_CLAUSE_IN_CONSTRUCTOR_DECLARATION, getAlignment(this.alignment_for_throws_clause_in_constructor_declaration));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_THROWS_CLAUSE_IN_METHOD_DECLARATION, getAlignment(this.alignment_for_throws_clause_in_method_declaration));
        options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGN_TYPE_MEMBERS_ON_COLUMNS, this.align_type_members_on_columns ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ANNOTATION_TYPE_DECLARATION, this.brace_position_for_annotation_type_declaration);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ANONYMOUS_TYPE_DECLARATION, this.brace_position_for_anonymous_type_declaration);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ARRAY_INITIALIZER, this.brace_position_for_array_initializer);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_BLOCK, this.brace_position_for_block);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_BLOCK_IN_CASE, this.brace_position_for_block_in_case);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_CONSTRUCTOR_DECLARATION, this.brace_position_for_constructor_declaration);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ENUM_CONSTANT, this.brace_position_for_enum_constant);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ENUM_DECLARATION, this.brace_position_for_enum_declaration);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_METHOD_DECLARATION, this.brace_position_for_method_declaration);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION, this.brace_position_for_type_declaration);
        options.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_SWITCH, this.brace_position_for_switch);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_CLEAR_BLANK_LINES, this.comment_clear_blank_lines ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT, this.comment_format ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_HEADER, this.comment_format_header ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_HTML, this.comment_format_html ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_SOURCE, this.comment_format_source ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_INDENT_PARAMETER_DESCRIPTION, this.comment_indent_parameter_description ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_INDENT_ROOT_TAGS, this.comment_indent_root_tags ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_INSERT_EMPTY_LINE_BEFORE_ROOT_TAGS, this.comment_insert_empty_line_before_root_tags ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_INSERT_NEW_LINE_FOR_PARAMETER, this.comment_insert_new_line_for_parameter ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_LINE_LENGTH, Integer.toString(this.comment_line_length));
        options.put(DefaultCodeFormatterConstants.FORMATTER_CONTINUATION_INDENTATION, Integer.toString(this.continuation_indentation));
        options.put(DefaultCodeFormatterConstants.FORMATTER_CONTINUATION_INDENTATION_FOR_ARRAY_INITIALIZER, Integer.toString(this.continuation_indentation_for_array_initializer));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AFTER_IMPORTS, Integer.toString(this.blank_lines_after_imports));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AFTER_PACKAGE, Integer.toString(this.blank_lines_after_package));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_FIELD, Integer.toString(this.blank_lines_before_field));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_FIRST_CLASS_BODY_DECLARATION, Integer.toString(this.blank_lines_before_first_class_body_declaration));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_IMPORTS, Integer.toString(this.blank_lines_before_imports));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_MEMBER_TYPE, Integer.toString(this.blank_lines_before_member_type));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_METHOD, Integer.toString(this.blank_lines_before_method));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_NEW_CHUNK, Integer.toString(this.blank_lines_before_new_chunk));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_PACKAGE, Integer.toString(this.blank_lines_before_package));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BETWEEN_TYPE_DECLARATIONS, Integer.toString(this.blank_lines_between_type_declarations));
        options.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AT_BEGINNING_OF_METHOD_BODY, Integer.toString(this.blank_lines_at_beginning_of_method_body));
        options.put(DefaultCodeFormatterConstants.FORMATTER_INDENT_STATEMENTS_COMPARE_TO_BLOCK, this.indent_statements_compare_to_block ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INDENT_STATEMENTS_COMPARE_TO_BODY, this.indent_statements_compare_to_body ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_ENUM_CONSTANT_HEADER, this.indent_body_declarations_compare_to_enum_constant_header ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_ENUM_DECLARATION_HEADER, this.indent_body_declarations_compare_to_enum_declaration_header ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_TYPE_HEADER, this.indent_body_declarations_compare_to_type_header ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INDENT_BREAKS_COMPARE_TO_CASES, this.indent_breaks_compare_to_cases ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INDENT_SWITCHSTATEMENTS_COMPARE_TO_CASES, this.indent_switchstatements_compare_to_cases ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INDENT_SWITCHSTATEMENTS_COMPARE_TO_SWITCH, this.indent_switchstatements_compare_to_switch ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INDENTATION_SIZE, Integer.toString(this.indentation_size));
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AFTER_ANNOTATION, this.insert_new_line_after_annotation ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AFTER_OPENING_BRACE_IN_ARRAY_INITIALIZER, this.insert_new_line_after_opening_brace_in_array_initializer? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AT_END_OF_FILE_IF_MISSING, this.insert_new_line_at_end_of_file_if_missing ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_CATCH_IN_TRY_STATEMENT, this.insert_new_line_before_catch_in_try_statement? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_CLOSING_BRACE_IN_ARRAY_INITIALIZER, this.insert_new_line_before_closing_brace_in_array_initializer? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_ELSE_IN_IF_STATEMENT, this.insert_new_line_before_else_in_if_statement? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_FINALLY_IN_TRY_STATEMENT, this.insert_new_line_before_finally_in_try_statement? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_WHILE_IN_DO_STATEMENT, this.insert_new_line_before_while_in_do_statement? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_ANONYMOUS_TYPE_DECLARATION, this.insert_new_line_in_empty_anonymous_type_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_BLOCK, this.insert_new_line_in_empty_block? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_ENUM_CONSTANT, this.insert_new_line_in_empty_enum_constant? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_ENUM_DECLARATION, this.insert_new_line_in_empty_enum_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_METHOD_BODY, this.insert_new_line_in_empty_method_body? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_TYPE_DECLARATION, this.insert_new_line_in_empty_type_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_AND_IN_TYPE_PARAMETER, this.insert_space_after_and_in_type_parameter? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_ASSIGNMENT_OPERATOR, this.insert_space_after_assignment_operator? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_AT_IN_ANNOTATION, this.insert_space_after_at_in_annotation? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_AT_IN_ANNOTATION_TYPE_DECLARATION, this.insert_space_after_at_in_annotation_type_declaration ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_BINARY_OPERATOR, this.insert_space_after_binary_operator? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_ANGLE_BRACKET_IN_TYPE_ARGUMENTS, this.insert_space_after_closing_angle_bracket_in_type_arguments ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_ANGLE_BRACKET_IN_TYPE_PARAMETERS, this.insert_space_after_closing_angle_bracket_in_type_parameters ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_PAREN_IN_CAST, this.insert_space_after_closing_paren_in_cast? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_BRACE_IN_BLOCK, this.insert_space_after_closing_brace_in_block? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_ASSERT, this.insert_space_after_colon_in_assert ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_CASE, this.insert_space_after_colon_in_case ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_CONDITIONAL, this.insert_space_after_colon_in_conditional ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_FOR, this.insert_space_after_colon_in_for ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_LABELED_STATEMENT, this.insert_space_after_colon_in_labeled_statement? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ALLOCATION_EXPRESSION, this.insert_space_after_comma_in_allocation_expression? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ANNOTATION, this.insert_space_after_comma_in_annotation? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ARRAY_INITIALIZER, this.insert_space_after_comma_in_array_initializer? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_CONSTRUCTOR_DECLARATION_PARAMETERS, this.insert_space_after_comma_in_constructor_declaration_parameters? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_CONSTRUCTOR_DECLARATION_THROWS, this.insert_space_after_comma_in_constructor_declaration_throws? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ENUM_CONSTANT_ARGUMENTS, this.insert_space_after_comma_in_enum_constant_arguments ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ENUM_DECLARATIONS, this.insert_space_after_comma_in_enum_declarations ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_EXPLICIT_CONSTRUCTOR_CALL_ARGUMENTS, this.insert_space_after_comma_in_explicit_constructor_call_arguments? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_FOR_INCREMENTS, this.insert_space_after_comma_in_for_increments? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_FOR_INITS, this.insert_space_after_comma_in_for_inits? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_INVOCATION_ARGUMENTS, this.insert_space_after_comma_in_method_invocation_arguments? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_DECLARATION_PARAMETERS, this.insert_space_after_comma_in_method_declaration_parameters? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_DECLARATION_THROWS, this.insert_space_after_comma_in_method_declaration_throws? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_MULTIPLE_FIELD_DECLARATIONS, this.insert_space_after_comma_in_multiple_field_declarations? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_MULTIPLE_LOCAL_DECLARATIONS, this.insert_space_after_comma_in_multiple_local_declarations? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_PARAMETERIZED_TYPE_REFERENCE, this.insert_space_after_comma_in_parameterized_type_reference? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_SUPERINTERFACES, this.insert_space_after_comma_in_superinterfaces? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_TYPE_ARGUMENTS, this.insert_space_after_comma_in_type_arguments ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_TYPE_PARAMETERS, this.insert_space_after_comma_in_type_parameters ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACKET_IN_ARRAY_ALLOCATION_EXPRESSION, this.insert_space_after_opening_bracket_in_array_allocation_expression? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_ELLIPSIS, this.insert_space_after_ellipsis ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_PARAMETERIZED_TYPE_REFERENCE, this.insert_space_after_opening_angle_bracket_in_parameterized_type_reference? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_TYPE_ARGUMENTS, this.insert_space_after_opening_angle_bracket_in_type_arguments? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_TYPE_PARAMETERS, this.insert_space_after_opening_angle_bracket_in_type_parameters? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACKET_IN_ARRAY_REFERENCE, this.insert_space_after_opening_bracket_in_array_reference? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACE_IN_ARRAY_INITIALIZER, this.insert_space_after_opening_brace_in_array_initializer? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_ANNOTATION, this.insert_space_after_opening_paren_in_annotation? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CAST, this.insert_space_after_opening_paren_in_cast? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CATCH, this.insert_space_after_opening_paren_in_catch? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CONSTRUCTOR_DECLARATION, this.insert_space_after_opening_paren_in_constructor_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_ENUM_CONSTANT, this.insert_space_after_opening_paren_in_enum_constant? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_FOR, this.insert_space_after_opening_paren_in_for? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_IF, this.insert_space_after_opening_paren_in_if? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_METHOD_DECLARATION, this.insert_space_after_opening_paren_in_method_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_METHOD_INVOCATION, this.insert_space_after_opening_paren_in_method_invocation? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_PARENTHESIZED_EXPRESSION, this.insert_space_after_opening_paren_in_parenthesized_expression? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_SWITCH, this.insert_space_after_opening_paren_in_switch? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_SYNCHRONIZED, this.insert_space_after_opening_paren_in_synchronized? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_WHILE, this.insert_space_after_opening_paren_in_while? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_POSTFIX_OPERATOR, this.insert_space_after_postfix_operator? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_PREFIX_OPERATOR, this.insert_space_after_prefix_operator? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_QUESTION_IN_CONDITIONAL, this.insert_space_after_question_in_conditional? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_QUESTION_IN_WILDCARD, this.insert_space_after_question_in_wilcard? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_SEMICOLON_IN_FOR, this.insert_space_after_semicolon_in_for? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_UNARY_OPERATOR, this.insert_space_after_unary_operator? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_AND_IN_TYPE_PARAMETER, this.insert_space_before_and_in_type_parameter ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_AT_IN_ANNOTATION_TYPE_DECLARATION, this.insert_space_before_at_in_annotation_type_declaration ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_ASSIGNMENT_OPERATOR, this.insert_space_before_assignment_operator? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_BINARY_OPERATOR, this.insert_space_before_binary_operator? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_PARAMETERIZED_TYPE_REFERENCE, this.insert_space_before_closing_angle_bracket_in_parameterized_type_reference? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_TYPE_ARGUMENTS, this.insert_space_before_closing_angle_bracket_in_type_arguments? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_TYPE_PARAMETERS, this.insert_space_before_closing_angle_bracket_in_type_parameters? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACE_IN_ARRAY_INITIALIZER, this.insert_space_before_closing_brace_in_array_initializer? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACKET_IN_ARRAY_ALLOCATION_EXPRESSION, this.insert_space_before_closing_bracket_in_array_allocation_expression? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACKET_IN_ARRAY_REFERENCE, this.insert_space_before_closing_bracket_in_array_reference? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_ANNOTATION, this.insert_space_before_closing_paren_in_annotation? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CAST, this.insert_space_before_closing_paren_in_cast? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CATCH, this.insert_space_before_closing_paren_in_catch? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CONSTRUCTOR_DECLARATION, this.insert_space_before_closing_paren_in_constructor_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_ENUM_CONSTANT, this.insert_space_before_closing_paren_in_enum_constant? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_FOR, this.insert_space_before_closing_paren_in_for? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_IF, this.insert_space_before_closing_paren_in_if? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_METHOD_DECLARATION, this.insert_space_before_closing_paren_in_method_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_METHOD_INVOCATION, this.insert_space_before_closing_paren_in_method_invocation? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_PARENTHESIZED_EXPRESSION, this.insert_space_before_closing_paren_in_parenthesized_expression? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_SWITCH, this.insert_space_before_closing_paren_in_switch? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_SYNCHRONIZED, this.insert_space_before_closing_paren_in_synchronized? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_WHILE, this.insert_space_before_closing_paren_in_while? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_ASSERT, this.insert_space_before_colon_in_assert? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_CASE, this.insert_space_before_colon_in_case? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_CONDITIONAL, this.insert_space_before_colon_in_conditional? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_DEFAULT, this.insert_space_before_colon_in_default? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_FOR, this.insert_space_before_colon_in_for ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_LABELED_STATEMENT, this.insert_space_before_colon_in_labeled_statement? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ALLOCATION_EXPRESSION, this.insert_space_before_comma_in_allocation_expression? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ANNOTATION, this.insert_space_before_comma_in_annotation? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ARRAY_INITIALIZER, this.insert_space_before_comma_in_array_initializer? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_CONSTRUCTOR_DECLARATION_PARAMETERS, this.insert_space_before_comma_in_constructor_declaration_parameters? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_CONSTRUCTOR_DECLARATION_THROWS, this.insert_space_before_comma_in_constructor_declaration_throws? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ENUM_CONSTANT_ARGUMENTS, this.insert_space_before_comma_in_enum_constant_arguments? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ENUM_DECLARATIONS, this.insert_space_before_comma_in_enum_declarations? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_EXPLICIT_CONSTRUCTOR_CALL_ARGUMENTS, this.insert_space_before_comma_in_explicit_constructor_call_arguments? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_FOR_INCREMENTS, this.insert_space_before_comma_in_for_increments? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_FOR_INITS, this.insert_space_before_comma_in_for_inits? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_INVOCATION_ARGUMENTS, this.insert_space_before_comma_in_method_invocation_arguments? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_DECLARATION_PARAMETERS, this.insert_space_before_comma_in_method_declaration_parameters? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_DECLARATION_THROWS, this.insert_space_before_comma_in_method_declaration_throws? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_MULTIPLE_FIELD_DECLARATIONS, this.insert_space_before_comma_in_multiple_field_declarations? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_MULTIPLE_LOCAL_DECLARATIONS, this.insert_space_before_comma_in_multiple_local_declarations? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_SUPERINTERFACES, this.insert_space_before_comma_in_superinterfaces? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_TYPE_ARGUMENTS, this.insert_space_before_comma_in_type_arguments ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_TYPE_PARAMETERS, this.insert_space_before_comma_in_type_parameters? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_PARAMETERIZED_TYPE_REFERENCE, this.insert_space_before_comma_in_parameterized_type_reference? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_ELLIPSIS, this.insert_space_before_ellipsis ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_PARAMETERIZED_TYPE_REFERENCE, this.insert_space_before_opening_angle_bracket_in_parameterized_type_reference? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_TYPE_ARGUMENTS, this.insert_space_before_opening_angle_bracket_in_type_arguments? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_TYPE_PARAMETERS, this.insert_space_before_opening_angle_bracket_in_type_parameters? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_ANNOTATION_TYPE_DECLARATION, this.insert_space_before_opening_brace_in_annotation_type_declaration ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_ANONYMOUS_TYPE_DECLARATION, this.insert_space_before_opening_brace_in_anonymous_type_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_ARRAY_INITIALIZER, this.insert_space_before_opening_brace_in_array_initializer? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_BLOCK, this.insert_space_before_opening_brace_in_block? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_CONSTRUCTOR_DECLARATION, this.insert_space_before_opening_brace_in_constructor_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_ENUM_CONSTANT, this.insert_space_before_opening_brace_in_enum_constant? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_ENUM_DECLARATION, this.insert_space_before_opening_brace_in_enum_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_METHOD_DECLARATION, this.insert_space_before_opening_brace_in_method_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_TYPE_DECLARATION, this.insert_space_before_opening_brace_in_type_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACKET_IN_ARRAY_ALLOCATION_EXPRESSION, this.insert_space_before_opening_bracket_in_array_allocation_expression ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACKET_IN_ARRAY_REFERENCE, this.insert_space_before_opening_bracket_in_array_reference? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACKET_IN_ARRAY_TYPE_REFERENCE, this.insert_space_before_opening_bracket_in_array_type_reference? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_ANNOTATION, this.insert_space_before_opening_paren_in_annotation? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_ANNOTATION_TYPE_MEMBER_DECLARATION, this.insert_space_before_opening_paren_in_annotation_type_member_declaration ? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_CATCH, this.insert_space_before_opening_paren_in_catch? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_CONSTRUCTOR_DECLARATION, this.insert_space_before_opening_paren_in_constructor_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_ENUM_CONSTANT, this.insert_space_before_opening_paren_in_enum_constant? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_FOR, this.insert_space_before_opening_paren_in_for? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_IF, this.insert_space_before_opening_paren_in_if? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_METHOD_INVOCATION, this.insert_space_before_opening_paren_in_method_invocation? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_METHOD_DECLARATION, this.insert_space_before_opening_paren_in_method_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_SWITCH, this.insert_space_before_opening_paren_in_switch? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_SWITCH, this.insert_space_before_opening_brace_in_switch? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_SYNCHRONIZED, this.insert_space_before_opening_paren_in_synchronized? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_PARENTHESIZED_EXPRESSION, this.insert_space_before_opening_paren_in_parenthesized_expression? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_WHILE, this.insert_space_before_opening_paren_in_while? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_POSTFIX_OPERATOR, this.insert_space_before_postfix_operator? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_PREFIX_OPERATOR, this.insert_space_before_prefix_operator? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_QUESTION_IN_CONDITIONAL, this.insert_space_before_question_in_conditional? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_QUESTION_IN_WILDCARD, this.insert_space_before_question_in_wilcard? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_SEMICOLON, this.insert_space_before_semicolon? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_SEMICOLON_IN_FOR, this.insert_space_before_semicolon_in_for? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_UNARY_OPERATOR, this.insert_space_before_unary_operator? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_BRACKETS_IN_ARRAY_TYPE_REFERENCE, this.insert_space_between_brackets_in_array_type_reference? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_BRACES_IN_ARRAY_INITIALIZER, this.insert_space_between_empty_braces_in_array_initializer? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_BRACKETS_IN_ARRAY_ALLOCATION_EXPRESSION, this.insert_space_between_empty_brackets_in_array_allocation_expression? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_ANNOTATION_TYPE_MEMBER_DECLARATION, this.insert_space_between_empty_parens_in_annotation_type_member_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_CONSTRUCTOR_DECLARATION, this.insert_space_between_empty_parens_in_constructor_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_ENUM_CONSTANT, this.insert_space_between_empty_parens_in_enum_constant? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_METHOD_DECLARATION, this.insert_space_between_empty_parens_in_method_declaration? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_METHOD_INVOCATION, this.insert_space_between_empty_parens_in_method_invocation? CoreOptionIDs.INSERT : CoreOptionIDs.DO_NOT_INSERT);
        options.put(DefaultCodeFormatterConstants.FORMATTER_COMPACT_ELSE_IF, this.compact_else_if ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_KEEP_GUARDIAN_CLAUSE_ON_ONE_LINE, this.keep_guardian_clause_on_one_line ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_KEEP_ELSE_STATEMENT_ON_SAME_LINE, this.keep_else_statement_on_same_line ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_KEEP_EMPTY_ARRAY_INITIALIZER_ON_ONE_LINE, this.keep_empty_array_initializer_on_one_line ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_KEEP_SIMPLE_IF_ON_ONE_LINE, this.keep_simple_if_on_one_line ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_KEEP_THEN_STATEMENT_ON_SAME_LINE, this.keep_then_statement_on_same_line ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_NUMBER_OF_EMPTY_LINES_TO_PRESERVE, Integer.toString(this.number_of_empty_lines_to_preserve));
        options.put(DefaultCodeFormatterConstants.FORMATTER_PUT_EMPTY_STATEMENT_ON_NEW_LINE, this.put_empty_statement_on_new_line ? DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        options.put(DefaultCodeFormatterConstants.FORMATTER_LINE_SPLIT, Integer.toString(this.page_width));
        switch(this.tab_char) {
            case SPACE :
                options.put(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR, CoreOptionIDs.SPACE);
                break;
            case TAB :
                options.put(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR, CoreOptionIDs.TAB);
                break;
            case MIXED :
                options.put(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR, DefaultCodeFormatterConstants.MIXED);
                break;
        }
        options.put(DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE, Integer.toString(this.tab_size));
        options.put(DefaultCodeFormatterConstants.FORMATTER_USE_TABS_ONLY_FOR_LEADING_INDENTATIONS, this.use_tabs_only_for_leading_indentations ?  DefaultCodeFormatterConstants.TRUE : DefaultCodeFormatterConstants.FALSE);
        
        options.put(DefaultCodeFormatterConstants.ENABLE_AUTO_COMPLETION, DefaultCodeFormatterConstants.TRUE);
        options.put(DefaultCodeFormatterConstants.ENABLE_INSERT_SINGLE_PROPOSAL_AUTOMATICALLY, DefaultCodeFormatterConstants.TRUE);
        options.put(DefaultCodeFormatterConstants.ENABLE_ADD_IMPORT_INSTEAD_OF_QUALIFIED_NAME, DefaultCodeFormatterConstants.TRUE);
        options.put(DefaultCodeFormatterConstants.ENABLE_FILL_ARGUMENT_NAMES_ON_COMPLETION, DefaultCodeFormatterConstants.TRUE);
        options.put(DefaultCodeFormatterConstants.AUTO_COMPLETION_TRIGGERS, ".");

        return options;
    }
    
    public void set(Map<String, String> settings) {
        final Object alignmentForArgumentsInAllocationExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_ALLOCATION_EXPRESSION);
        if (alignmentForArgumentsInAllocationExpressionOption != null) {
            try {
                this.alignment_for_arguments_in_allocation_expression = Integer.parseInt((String) alignmentForArgumentsInAllocationExpressionOption);
            } catch (NumberFormatException e) {
                this.alignment_for_arguments_in_allocation_expression = Alignment.M_COMPACT_SPLIT;
            } catch (ClassCastException e) {
                this.alignment_for_arguments_in_allocation_expression = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForArgumentsInEnumConstantOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_ENUM_CONSTANT);
        if (alignmentForArgumentsInEnumConstantOption != null) {
            try {
                this.alignment_for_arguments_in_enum_constant = Integer.parseInt((String) alignmentForArgumentsInEnumConstantOption);
            } catch (NumberFormatException e) {
                this.alignment_for_arguments_in_enum_constant = Alignment.M_COMPACT_SPLIT;
            } catch (ClassCastException e) {
                this.alignment_for_arguments_in_enum_constant = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForArgumentsInExplicitConstructorCallOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_EXPLICIT_CONSTRUCTOR_CALL);
        if (alignmentForArgumentsInExplicitConstructorCallOption != null) {
            try {
                this.alignment_for_arguments_in_explicit_constructor_call = Integer.parseInt((String) alignmentForArgumentsInExplicitConstructorCallOption);
            } catch (NumberFormatException e) {
                this.alignment_for_arguments_in_explicit_constructor_call = Alignment.M_COMPACT_SPLIT;
            } catch (ClassCastException e) {
                this.alignment_for_arguments_in_explicit_constructor_call = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForArgumentsInMethodInvocationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_METHOD_INVOCATION);
        if (alignmentForArgumentsInMethodInvocationOption != null) {
            try {
                this.alignment_for_arguments_in_method_invocation = Integer.parseInt((String) alignmentForArgumentsInMethodInvocationOption);
            } catch (NumberFormatException e) {
                this.alignment_for_arguments_in_method_invocation = Alignment.M_COMPACT_SPLIT;
            } catch (ClassCastException e) {
                this.alignment_for_arguments_in_method_invocation = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForArgumentsInQualifiedAllocationExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_QUALIFIED_ALLOCATION_EXPRESSION);
        if (alignmentForArgumentsInQualifiedAllocationExpressionOption != null) {
            try {
                this.alignment_for_arguments_in_qualified_allocation_expression = Integer.parseInt((String) alignmentForArgumentsInQualifiedAllocationExpressionOption);
            } catch (NumberFormatException e) {
                this.alignment_for_arguments_in_qualified_allocation_expression = Alignment.M_COMPACT_SPLIT;
            } catch (ClassCastException e) {
                this.alignment_for_arguments_in_qualified_allocation_expression = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForBinaryExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_BINARY_EXPRESSION);
        if (alignmentForBinaryExpressionOption != null) {
            try {
                this.alignment_for_binary_expression = Integer.parseInt((String) alignmentForBinaryExpressionOption);
            } catch (NumberFormatException e) {
                this.alignment_for_binary_expression =  Alignment.M_COMPACT_SPLIT;
            } catch (ClassCastException e) {
                this.alignment_for_binary_expression =  Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForCompactIfOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_COMPACT_IF);
        if (alignmentForCompactIfOption != null) {
            try {
                this.alignment_for_compact_if = Integer.parseInt((String) alignmentForCompactIfOption);
            } catch (NumberFormatException e) {
                this.alignment_for_compact_if = Alignment.M_ONE_PER_LINE_SPLIT | Alignment.M_INDENT_BY_ONE;
            } catch (ClassCastException e) {
                this.alignment_for_compact_if = Alignment.M_ONE_PER_LINE_SPLIT | Alignment.M_INDENT_BY_ONE;
            }
        }
        final Object alignmentForConditionalExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_CONDITIONAL_EXPRESSION);
        if (alignmentForConditionalExpressionOption != null) {
            try {
                this.alignment_for_conditional_expression = Integer.parseInt((String) alignmentForConditionalExpressionOption);
            } catch (NumberFormatException e) {
                this.alignment_for_conditional_expression = Alignment.M_ONE_PER_LINE_SPLIT;
            } catch (ClassCastException e) {
                this.alignment_for_conditional_expression = Alignment.M_ONE_PER_LINE_SPLIT;
            }
        }
        final Object alignmentForEnumConstantsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ENUM_CONSTANTS);
        if (alignmentForEnumConstantsOption != null) {
            try {
                this.alignment_for_enum_constants = Integer.parseInt((String) alignmentForEnumConstantsOption);
            } catch (NumberFormatException e) {
                this.alignment_for_enum_constants = Alignment.NONE;
            } catch (ClassCastException e) {
                this.alignment_for_enum_constants = Alignment.NONE;
            }
        }
        final Object alignmentForExpressionsInArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_EXPRESSIONS_IN_ARRAY_INITIALIZER);
        if (alignmentForExpressionsInArrayInitializerOption != null) {
            try {
                this.alignment_for_expressions_in_array_initializer = Integer.parseInt((String) alignmentForExpressionsInArrayInitializerOption);
            } catch (NumberFormatException e) {
                this.alignment_for_expressions_in_array_initializer = Alignment.M_COMPACT_SPLIT;
            } catch (ClassCastException e) {
                this.alignment_for_expressions_in_array_initializer = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForMultipleFieldsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_MULTIPLE_FIELDS);
        if (alignmentForMultipleFieldsOption != null) {
            try {
                this.alignment_for_multiple_fields = Integer.parseInt((String) alignmentForMultipleFieldsOption);
            } catch (NumberFormatException e) {
                this.alignment_for_multiple_fields = Alignment.M_COMPACT_SPLIT;
            } catch (ClassCastException e) {
                this.alignment_for_multiple_fields = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForParametersInConstructorDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_PARAMETERS_IN_CONSTRUCTOR_DECLARATION);
        if (alignmentForParametersInConstructorDeclarationOption != null) {
            try {
                this.alignment_for_parameters_in_constructor_declaration = Integer.parseInt((String) alignmentForParametersInConstructorDeclarationOption);
            } catch (NumberFormatException e) {
                this.alignment_for_parameters_in_constructor_declaration = Alignment.M_COMPACT_SPLIT;
            } catch (ClassCastException e) {
                this.alignment_for_parameters_in_constructor_declaration = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForParametersInMethodDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_PARAMETERS_IN_METHOD_DECLARATION);
        if (alignmentForParametersInMethodDeclarationOption != null) {
            try {
                this.alignment_for_parameters_in_method_declaration = Integer.parseInt((String) alignmentForParametersInMethodDeclarationOption);
            } catch (NumberFormatException e) {
                this.alignment_for_parameters_in_method_declaration = Alignment.M_COMPACT_SPLIT;
            } catch(ClassCastException e) {
                this.alignment_for_parameters_in_method_declaration = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForSelectorInMethodInvocationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_SELECTOR_IN_METHOD_INVOCATION);
        if (alignmentForSelectorInMethodInvocationOption != null) {
            try {
                this.alignment_for_selector_in_method_invocation = Integer.parseInt((String) alignmentForSelectorInMethodInvocationOption);
            } catch (NumberFormatException e) {
                this.alignment_for_selector_in_method_invocation = Alignment.M_COMPACT_SPLIT;
            } catch(ClassCastException e) {
                this.alignment_for_selector_in_method_invocation = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForSuperclassInTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_SUPERCLASS_IN_TYPE_DECLARATION);
        if (alignmentForSuperclassInTypeDeclarationOption != null) {
            try {
                this.alignment_for_superclass_in_type_declaration = Integer.parseInt((String) alignmentForSuperclassInTypeDeclarationOption);
            } catch (NumberFormatException e) {
                this.alignment_for_superclass_in_type_declaration = Alignment.M_NEXT_SHIFTED_SPLIT;
            } catch(ClassCastException e) {
                this.alignment_for_superclass_in_type_declaration = Alignment.M_NEXT_SHIFTED_SPLIT;
            }
        }
        final Object alignmentForSuperinterfacesInEnumDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_SUPERINTERFACES_IN_ENUM_DECLARATION);
        if (alignmentForSuperinterfacesInEnumDeclarationOption != null) {
            try {
                this.alignment_for_superinterfaces_in_enum_declaration = Integer.parseInt((String) alignmentForSuperinterfacesInEnumDeclarationOption);
            } catch (NumberFormatException e) {
                this.alignment_for_superinterfaces_in_enum_declaration = Alignment.M_NEXT_SHIFTED_SPLIT;
            } catch(ClassCastException e) {
                this.alignment_for_superinterfaces_in_enum_declaration = Alignment.M_NEXT_SHIFTED_SPLIT;
            }
        }
        final Object alignmentForSuperinterfacesInTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_SUPERINTERFACES_IN_TYPE_DECLARATION);
        if (alignmentForSuperinterfacesInTypeDeclarationOption != null) {
            try {
                this.alignment_for_superinterfaces_in_type_declaration = Integer.parseInt((String) alignmentForSuperinterfacesInTypeDeclarationOption);
            } catch (NumberFormatException e) {
                this.alignment_for_superinterfaces_in_type_declaration = Alignment.M_NEXT_SHIFTED_SPLIT;
            } catch(ClassCastException e) {
                this.alignment_for_superinterfaces_in_type_declaration = Alignment.M_NEXT_SHIFTED_SPLIT;
            }
        }
        final Object alignmentForThrowsClauseInConstructorDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_THROWS_CLAUSE_IN_CONSTRUCTOR_DECLARATION);
        if (alignmentForThrowsClauseInConstructorDeclarationOption != null) {
            try {
                this.alignment_for_throws_clause_in_constructor_declaration = Integer.parseInt((String) alignmentForThrowsClauseInConstructorDeclarationOption);
            } catch (NumberFormatException e) {
                this.alignment_for_throws_clause_in_constructor_declaration = Alignment.M_COMPACT_SPLIT;
            } catch(ClassCastException e) {
                this.alignment_for_throws_clause_in_constructor_declaration = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignmentForThrowsClauseInMethodDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_THROWS_CLAUSE_IN_METHOD_DECLARATION);
        if (alignmentForThrowsClauseInMethodDeclarationOption != null) {
            try {
                this.alignment_for_throws_clause_in_method_declaration = Integer.parseInt((String) alignmentForThrowsClauseInMethodDeclarationOption);
            } catch (NumberFormatException e) {
                this.alignment_for_throws_clause_in_method_declaration = Alignment.M_COMPACT_SPLIT;
            } catch(ClassCastException e) {
                this.alignment_for_throws_clause_in_method_declaration = Alignment.M_COMPACT_SPLIT;
            }
        }
        final Object alignTypeMembersOnColumnsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_ALIGN_TYPE_MEMBERS_ON_COLUMNS);
        if (alignTypeMembersOnColumnsOption != null) {
            this.align_type_members_on_columns = DefaultCodeFormatterConstants.TRUE.equals(alignTypeMembersOnColumnsOption);
        }
        final Object bracePositionForAnnotationTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ANNOTATION_TYPE_DECLARATION);
        if (bracePositionForAnnotationTypeDeclarationOption != null) {
            try {
                this.brace_position_for_annotation_type_declaration = (String) bracePositionForAnnotationTypeDeclarationOption;
            } catch(ClassCastException e) {
                this.brace_position_for_annotation_type_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object bracePositionForAnonymousTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ANONYMOUS_TYPE_DECLARATION);
        if (bracePositionForAnonymousTypeDeclarationOption != null) {
            try {
                this.brace_position_for_anonymous_type_declaration = (String) bracePositionForAnonymousTypeDeclarationOption;
            } catch(ClassCastException e) {
                this.brace_position_for_anonymous_type_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object bracePositionForArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ARRAY_INITIALIZER);
        if (bracePositionForArrayInitializerOption != null) {
            try {
                this.brace_position_for_array_initializer = (String) bracePositionForArrayInitializerOption;
            } catch(ClassCastException e) {
                this.brace_position_for_array_initializer = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object bracePositionForBlockOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_BLOCK);
        if (bracePositionForBlockOption != null) {
            try {
                this.brace_position_for_block = (String) bracePositionForBlockOption;
            } catch(ClassCastException e) {
                this.brace_position_for_block = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object bracePositionForBlockInCaseOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_BLOCK_IN_CASE);
        if (bracePositionForBlockInCaseOption != null) {
            try {
                this.brace_position_for_block_in_case = (String) bracePositionForBlockInCaseOption;
            } catch(ClassCastException e) {
                this.brace_position_for_block_in_case = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object bracePositionForConstructorDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_CONSTRUCTOR_DECLARATION);
        if (bracePositionForConstructorDeclarationOption != null) {
            try {
                this.brace_position_for_constructor_declaration = (String) bracePositionForConstructorDeclarationOption;
            } catch(ClassCastException e) {
                this.brace_position_for_constructor_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object bracePositionForEnumConstantOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ENUM_CONSTANT);
        if (bracePositionForEnumConstantOption != null) {
            try {
                this.brace_position_for_enum_constant = (String) bracePositionForEnumConstantOption;
            } catch(ClassCastException e) {
                this.brace_position_for_enum_constant = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object bracePositionForEnumDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ENUM_DECLARATION);
        if (bracePositionForEnumDeclarationOption != null) {
            try {
                this.brace_position_for_enum_declaration = (String) bracePositionForEnumDeclarationOption;
            } catch(ClassCastException e) {
                this.brace_position_for_enum_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object bracePositionForMethodDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_METHOD_DECLARATION);
        if (bracePositionForMethodDeclarationOption != null) {
            try {
                this.brace_position_for_method_declaration = (String) bracePositionForMethodDeclarationOption;
            } catch(ClassCastException e) {
                this.brace_position_for_method_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object bracePositionForSwitchOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_SWITCH);
        if (bracePositionForSwitchOption != null) {
            try {
                this.brace_position_for_switch = (String) bracePositionForSwitchOption;
            } catch(ClassCastException e) {
                this.brace_position_for_switch = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object bracePositionForTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION);
        if (bracePositionForTypeDeclarationOption != null) {
            try {
                this.brace_position_for_type_declaration = (String) bracePositionForTypeDeclarationOption;
            } catch(ClassCastException e) {
                this.brace_position_for_type_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
            }
        }
        final Object continuationIndentationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_CONTINUATION_INDENTATION);
        if (continuationIndentationOption != null) {
            try {
                this.continuation_indentation = Integer.parseInt((String) continuationIndentationOption);
            } catch (NumberFormatException e) {
                this.continuation_indentation = 1;
            } catch(ClassCastException e) {
                this.continuation_indentation = 1;
            }
        }
        final Object continuationIndentationForArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_CONTINUATION_INDENTATION_FOR_ARRAY_INITIALIZER);
        if (continuationIndentationForArrayInitializerOption != null) {
            try {
                this.continuation_indentation_for_array_initializer = Integer.parseInt((String) continuationIndentationForArrayInitializerOption);
            } catch (NumberFormatException e) {
                this.continuation_indentation_for_array_initializer = 1;
            } catch(ClassCastException e) {
                this.continuation_indentation_for_array_initializer = 1;
            }
        }
        final Object blankLinesAfterImportsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AFTER_IMPORTS);
        if (blankLinesAfterImportsOption != null) {
            try {
                this.blank_lines_after_imports = Integer.parseInt((String) blankLinesAfterImportsOption);
            } catch (NumberFormatException e) {
                this.blank_lines_after_imports = 0;
            } catch(ClassCastException e) {
                this.blank_lines_after_imports = 0;
            }
        }
        final Object blankLinesAfterPackageOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AFTER_PACKAGE);
        if (blankLinesAfterPackageOption != null) {
            try {
                this.blank_lines_after_package = Integer.parseInt((String) blankLinesAfterPackageOption);
            } catch (NumberFormatException e) {
                this.blank_lines_after_package = 0;
            } catch(ClassCastException e) {
                this.blank_lines_after_package = 0;
            }
        }
        final Object blankLinesBeforeFieldOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_FIELD);
        if (blankLinesBeforeFieldOption != null) {
            try {
                this.blank_lines_before_field = Integer.parseInt((String) blankLinesBeforeFieldOption);
            } catch (NumberFormatException e) {
                this.blank_lines_before_field = 0;
            } catch(ClassCastException e) {
                this.blank_lines_before_field = 0;
            }
        }
        final Object blankLinesBeforeFirstClassBodyDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_FIRST_CLASS_BODY_DECLARATION);
        if (blankLinesBeforeFirstClassBodyDeclarationOption != null) {
            try {
                this.blank_lines_before_first_class_body_declaration = Integer.parseInt((String) blankLinesBeforeFirstClassBodyDeclarationOption);
            } catch (NumberFormatException e) {
                this.blank_lines_before_first_class_body_declaration = 0;
            } catch(ClassCastException e) {
                this.blank_lines_before_first_class_body_declaration = 0;
            }
        }
        final Object blankLinesBeforeImportsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_IMPORTS);
        if (blankLinesBeforeImportsOption != null) {
            try {
                this.blank_lines_before_imports = Integer.parseInt((String) blankLinesBeforeImportsOption);
            } catch (NumberFormatException e) {
                this.blank_lines_before_imports = 0;
            } catch(ClassCastException e) {
                this.blank_lines_before_imports = 0;
            }
        }
        final Object blankLinesBeforeMemberTypeOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_MEMBER_TYPE);
        if (blankLinesBeforeMemberTypeOption != null) {
            try {
                this.blank_lines_before_member_type = Integer.parseInt((String) blankLinesBeforeMemberTypeOption);
            } catch (NumberFormatException e) {
                this.blank_lines_before_member_type = 0;
            } catch(ClassCastException e) {
                this.blank_lines_before_member_type = 0;
            }
        }
        final Object blankLinesBeforeMethodOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_METHOD);
        if (blankLinesBeforeMethodOption != null) {
            try {
                this.blank_lines_before_method = Integer.parseInt((String) blankLinesBeforeMethodOption);
            } catch (NumberFormatException e) {
                this.blank_lines_before_method = 0;
            } catch(ClassCastException e) {
                this.blank_lines_before_method = 0;
            }
        }
        final Object blankLinesBeforeNewChunkOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_NEW_CHUNK);
        if (blankLinesBeforeNewChunkOption != null) {
            try {
                this.blank_lines_before_new_chunk = Integer.parseInt((String) blankLinesBeforeNewChunkOption);
            } catch (NumberFormatException e) {
                this.blank_lines_before_new_chunk = 0;
            } catch(ClassCastException e) {
                this.blank_lines_before_new_chunk = 0;
            }
        }
        final Object blankLinesBeforePackageOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_PACKAGE);
        if (blankLinesBeforePackageOption != null) {
            try {
                this.blank_lines_before_package = Integer.parseInt((String) blankLinesBeforePackageOption);
            } catch (NumberFormatException e) {
                this.blank_lines_before_package = 0;
            } catch(ClassCastException e) {
                this.blank_lines_before_package = 0;
            }
        }
        final Object blankLinesBetweenTypeDeclarationsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BETWEEN_TYPE_DECLARATIONS);
        if (blankLinesBetweenTypeDeclarationsOption != null) {
            try {
                this.blank_lines_between_type_declarations = Integer.parseInt((String) blankLinesBetweenTypeDeclarationsOption);
            } catch (NumberFormatException e) {
                this.blank_lines_between_type_declarations = 0;
            } catch(ClassCastException e) {
                this.blank_lines_between_type_declarations = 0;
            }
        }
        final Object blankLinesAtBeginningOfMethodBodyOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AT_BEGINNING_OF_METHOD_BODY);
        if (blankLinesAtBeginningOfMethodBodyOption != null) {
            try {
                this.blank_lines_at_beginning_of_method_body = Integer.parseInt((String) blankLinesAtBeginningOfMethodBodyOption);
            } catch (NumberFormatException e) {
                this.blank_lines_at_beginning_of_method_body = 0;
            } catch(ClassCastException e) {
                this.blank_lines_at_beginning_of_method_body = 0;
            }
        }
        final Object commentClearBlankLinesOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMMENT_CLEAR_BLANK_LINES);
        if (commentClearBlankLinesOption != null) {
            this.comment_clear_blank_lines = DefaultCodeFormatterConstants.TRUE.equals(commentClearBlankLinesOption);
        }
        final Object commentFormatOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT);
        if (commentFormatOption != null) {
            this.comment_format = DefaultCodeFormatterConstants.TRUE.equals(commentFormatOption);
        }
        final Object commentFormatHeaderOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_HEADER);
        if (commentFormatHeaderOption != null) {
            this.comment_format_header = DefaultCodeFormatterConstants.TRUE.equals(commentFormatHeaderOption);
        }
        final Object commentFormatHtmlOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_HTML);
        if (commentFormatHtmlOption != null) {
            this.comment_format_html = DefaultCodeFormatterConstants.TRUE.equals(commentFormatHtmlOption);
        }
        final Object commentFormatSourceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_SOURCE);
        if (commentFormatSourceOption != null) {
            this.comment_format_source = DefaultCodeFormatterConstants.TRUE.equals(commentFormatSourceOption);
        }
        final Object commentIndentParameterDescriptionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMMENT_INDENT_PARAMETER_DESCRIPTION);
        if (commentIndentParameterDescriptionOption != null) {
            this.comment_indent_parameter_description = DefaultCodeFormatterConstants.TRUE.equals(commentIndentParameterDescriptionOption);
        }
        final Object commentIndentRootTagsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMMENT_INDENT_ROOT_TAGS);
        if (commentIndentRootTagsOption != null) {
            this.comment_indent_root_tags = DefaultCodeFormatterConstants.TRUE.equals(commentIndentRootTagsOption);
        }
        final Object commentInsertEmptyLineBeforeRootTagsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMMENT_INSERT_EMPTY_LINE_BEFORE_ROOT_TAGS);
        if (commentInsertEmptyLineBeforeRootTagsOption != null) {
            this.comment_insert_empty_line_before_root_tags = CoreOptionIDs.INSERT.equals(commentInsertEmptyLineBeforeRootTagsOption);
        }
        final Object commentInsertNewLineForParameterOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMMENT_INSERT_NEW_LINE_FOR_PARAMETER);
        if (commentInsertNewLineForParameterOption != null) {
            this.comment_insert_new_line_for_parameter = CoreOptionIDs.INSERT.equals(commentInsertNewLineForParameterOption);
        }
        final Object commentLineLengthOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMMENT_LINE_LENGTH);
        if (commentLineLengthOption != null) {
            try {
                this.comment_line_length = Integer.parseInt((String) commentLineLengthOption);
            } catch (NumberFormatException e) {
                this.comment_line_length = 80;
            } catch(ClassCastException e) {
                this.comment_line_length = 80;
            }
        }
        final Object indentStatementsCompareToBlockOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INDENT_STATEMENTS_COMPARE_TO_BLOCK);
        if (indentStatementsCompareToBlockOption != null) {
            this.indent_statements_compare_to_block = DefaultCodeFormatterConstants.TRUE.equals(indentStatementsCompareToBlockOption);
        }
        final Object indentStatementsCompareToBodyOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INDENT_STATEMENTS_COMPARE_TO_BODY);
        if (indentStatementsCompareToBodyOption != null) {
            this.indent_statements_compare_to_body = DefaultCodeFormatterConstants.TRUE.equals(indentStatementsCompareToBodyOption);
        }
        final Object indentBodyDeclarationsCompareToEnumConstantHeaderOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_ENUM_CONSTANT_HEADER);
        if (indentBodyDeclarationsCompareToEnumConstantHeaderOption != null) {
            this.indent_body_declarations_compare_to_enum_constant_header = DefaultCodeFormatterConstants.TRUE.equals(indentBodyDeclarationsCompareToEnumConstantHeaderOption);
        }
        final Object indentBodyDeclarationsCompareToEnumDeclarationHeaderOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_ENUM_DECLARATION_HEADER);
        if (indentBodyDeclarationsCompareToEnumDeclarationHeaderOption != null) {
            this.indent_body_declarations_compare_to_enum_declaration_header = DefaultCodeFormatterConstants.TRUE.equals(indentBodyDeclarationsCompareToEnumDeclarationHeaderOption);
        }
        final Object indentBodyDeclarationsCompareToTypeHeaderOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_TYPE_HEADER);
        if (indentBodyDeclarationsCompareToTypeHeaderOption != null) {
            this.indent_body_declarations_compare_to_type_header = DefaultCodeFormatterConstants.TRUE.equals(indentBodyDeclarationsCompareToTypeHeaderOption);
        }
        final Object indentBreaksCompareToCasesOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INDENT_BREAKS_COMPARE_TO_CASES);
        if (indentBreaksCompareToCasesOption != null) {
            this.indent_breaks_compare_to_cases = DefaultCodeFormatterConstants.TRUE.equals(indentBreaksCompareToCasesOption);
        }
        final Object indentSwitchstatementsCompareToCasesOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INDENT_SWITCHSTATEMENTS_COMPARE_TO_CASES);
        if (indentSwitchstatementsCompareToCasesOption != null) {
            this.indent_switchstatements_compare_to_cases = DefaultCodeFormatterConstants.TRUE.equals(indentSwitchstatementsCompareToCasesOption);
        }
        final Object indentSwitchstatementsCompareToSwitchOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INDENT_SWITCHSTATEMENTS_COMPARE_TO_SWITCH);
        if (indentSwitchstatementsCompareToSwitchOption != null) {
            this.indent_switchstatements_compare_to_switch = DefaultCodeFormatterConstants.TRUE.equals(indentSwitchstatementsCompareToSwitchOption);
        }
        final Object indentationSizeOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INDENTATION_SIZE);
        if (indentationSizeOption != null) {
            try {
                this.indentation_size = Integer.parseInt((String) indentationSizeOption);
            } catch (NumberFormatException e) {
                this.indentation_size = 4;
            } catch(ClassCastException e) {
                this.indentation_size = 4;
            }
        }
        final Object insertNewLineAfterAnnotationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AFTER_ANNOTATION);
        if (insertNewLineAfterAnnotationOption != null) {
            this.insert_new_line_after_annotation = CoreOptionIDs.INSERT.equals(insertNewLineAfterAnnotationOption);
        }
        final Object insertNewLineAfterOpeningBraceInArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AFTER_OPENING_BRACE_IN_ARRAY_INITIALIZER);
        if (insertNewLineAfterOpeningBraceInArrayInitializerOption != null) {
            this.insert_new_line_after_opening_brace_in_array_initializer = CoreOptionIDs.INSERT.equals(insertNewLineAfterOpeningBraceInArrayInitializerOption);
        }
        final Object insertNewLineAtEndOfFileIfMissingOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AT_END_OF_FILE_IF_MISSING);
        if (insertNewLineAtEndOfFileIfMissingOption != null) {
            this.insert_new_line_at_end_of_file_if_missing = CoreOptionIDs.INSERT.equals(insertNewLineAtEndOfFileIfMissingOption);
        }
        final Object insertNewLineBeforeCatchInTryStatementOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_CATCH_IN_TRY_STATEMENT);
        if (insertNewLineBeforeCatchInTryStatementOption != null) {
            this.insert_new_line_before_catch_in_try_statement = CoreOptionIDs.INSERT.equals(insertNewLineBeforeCatchInTryStatementOption);
        }
        final Object insertNewLineBeforeClosingBraceInArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_CLOSING_BRACE_IN_ARRAY_INITIALIZER);
        if (insertNewLineBeforeClosingBraceInArrayInitializerOption != null) {
            this.insert_new_line_before_closing_brace_in_array_initializer = CoreOptionIDs.INSERT.equals(insertNewLineBeforeClosingBraceInArrayInitializerOption);
        }
        final Object insertNewLineBeforeElseInIfStatementOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_ELSE_IN_IF_STATEMENT);
        if (insertNewLineBeforeElseInIfStatementOption != null) {
            this.insert_new_line_before_else_in_if_statement = CoreOptionIDs.INSERT.equals(insertNewLineBeforeElseInIfStatementOption);
        }
        final Object insertNewLineBeforeFinallyInTryStatementOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_FINALLY_IN_TRY_STATEMENT);
        if (insertNewLineBeforeFinallyInTryStatementOption != null) {
            this.insert_new_line_before_finally_in_try_statement = CoreOptionIDs.INSERT.equals(insertNewLineBeforeFinallyInTryStatementOption);
        }
        final Object insertNewLineBeforeWhileInDoStatementOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_WHILE_IN_DO_STATEMENT);
        if (insertNewLineBeforeWhileInDoStatementOption != null) {
            this.insert_new_line_before_while_in_do_statement = CoreOptionIDs.INSERT.equals(insertNewLineBeforeWhileInDoStatementOption);
        }
        final Object insertNewLineInEmptyAnonymousTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_ANONYMOUS_TYPE_DECLARATION);
        if (insertNewLineInEmptyAnonymousTypeDeclarationOption != null) {
            this.insert_new_line_in_empty_anonymous_type_declaration = CoreOptionIDs.INSERT.equals(insertNewLineInEmptyAnonymousTypeDeclarationOption);
        }
        final Object insertNewLineInEmptyBlockOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_BLOCK);
        if (insertNewLineInEmptyBlockOption != null) {
            this.insert_new_line_in_empty_block = CoreOptionIDs.INSERT.equals(insertNewLineInEmptyBlockOption);
        }
        final Object insertNewLineInEmptyEnumConstantOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_ENUM_CONSTANT);
        if (insertNewLineInEmptyEnumConstantOption != null) {
            this.insert_new_line_in_empty_enum_constant = CoreOptionIDs.INSERT.equals(insertNewLineInEmptyEnumConstantOption);
        }
        final Object insertNewLineInEmptyEnumDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_ENUM_DECLARATION);
        if (insertNewLineInEmptyEnumDeclarationOption != null) {
            this.insert_new_line_in_empty_enum_declaration = CoreOptionIDs.INSERT.equals(insertNewLineInEmptyEnumDeclarationOption);
        }
        final Object insertNewLineInEmptyMethodBodyOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_METHOD_BODY);
        if (insertNewLineInEmptyMethodBodyOption != null) {
            this.insert_new_line_in_empty_method_body = CoreOptionIDs.INSERT.equals(insertNewLineInEmptyMethodBodyOption);
        }
        final Object insertNewLineInEmptyTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_TYPE_DECLARATION);
        if (insertNewLineInEmptyTypeDeclarationOption != null) {
            this.insert_new_line_in_empty_type_declaration = CoreOptionIDs.INSERT.equals(insertNewLineInEmptyTypeDeclarationOption);
        }
        final Object insertSpaceAfterAndInWildcardOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_AND_IN_TYPE_PARAMETER);
        if (insertSpaceAfterAndInWildcardOption != null) {
            this.insert_space_after_and_in_type_parameter = CoreOptionIDs.INSERT.equals(insertSpaceAfterAndInWildcardOption);
        }
        final Object insertSpaceAfterAssignmentOperatorOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_ASSIGNMENT_OPERATOR);
        if (insertSpaceAfterAssignmentOperatorOption != null) {
            this.insert_space_after_assignment_operator = CoreOptionIDs.INSERT.equals(insertSpaceAfterAssignmentOperatorOption);
        }
        final Object insertSpaceAfterAtInAnnotationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_AT_IN_ANNOTATION);
        if (insertSpaceAfterAtInAnnotationOption != null) {
            this.insert_space_after_at_in_annotation = CoreOptionIDs.INSERT.equals(insertSpaceAfterAtInAnnotationOption);
        }
        final Object insertSpaceAfterAtInAnnotationTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_AT_IN_ANNOTATION_TYPE_DECLARATION);
        if (insertSpaceAfterAtInAnnotationTypeDeclarationOption != null) {
            this.insert_space_after_at_in_annotation_type_declaration = CoreOptionIDs.INSERT.equals(insertSpaceAfterAtInAnnotationTypeDeclarationOption);
        }
        final Object insertSpaceAfterBinaryOperatorOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_BINARY_OPERATOR);
        if (insertSpaceAfterBinaryOperatorOption != null) {
            this.insert_space_after_binary_operator = CoreOptionIDs.INSERT.equals(insertSpaceAfterBinaryOperatorOption);
        }
        final Object insertSpaceAfterClosingAngleBracketInTypeArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_ANGLE_BRACKET_IN_TYPE_ARGUMENTS);
        if (insertSpaceAfterClosingAngleBracketInTypeArgumentsOption != null) {
            this.insert_space_after_closing_angle_bracket_in_type_arguments = CoreOptionIDs.INSERT.equals(insertSpaceAfterClosingAngleBracketInTypeArgumentsOption);
        }
        final Object insertSpaceAfterClosingAngleBracketInTypeParametersOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_ANGLE_BRACKET_IN_TYPE_PARAMETERS);
        if (insertSpaceAfterClosingAngleBracketInTypeParametersOption != null) {
            this.insert_space_after_closing_angle_bracket_in_type_parameters = CoreOptionIDs.INSERT.equals(insertSpaceAfterClosingAngleBracketInTypeParametersOption);
        }
        final Object insertSpaceAfterClosingParenInCastOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_PAREN_IN_CAST);
        if (insertSpaceAfterClosingParenInCastOption != null) {
            this.insert_space_after_closing_paren_in_cast = CoreOptionIDs.INSERT.equals(insertSpaceAfterClosingParenInCastOption);
        }
        final Object insertSpaceAfterClosingBraceInBlockOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_BRACE_IN_BLOCK);
        if (insertSpaceAfterClosingBraceInBlockOption != null) {
            this.insert_space_after_closing_brace_in_block = CoreOptionIDs.INSERT.equals(insertSpaceAfterClosingBraceInBlockOption);
        }
        final Object insertSpaceAfterColonInAssertOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_ASSERT);
        if (insertSpaceAfterColonInAssertOption != null) {
            this.insert_space_after_colon_in_assert = CoreOptionIDs.INSERT.equals(insertSpaceAfterColonInAssertOption);
        }
        final Object insertSpaceAfterColonInCaseOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_CASE);
        if (insertSpaceAfterColonInCaseOption != null) {
            this.insert_space_after_colon_in_case = CoreOptionIDs.INSERT.equals(insertSpaceAfterColonInCaseOption);
        }
        final Object insertSpaceAfterColonInConditionalOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_CONDITIONAL);
        if (insertSpaceAfterColonInConditionalOption != null) {
            this.insert_space_after_colon_in_conditional = CoreOptionIDs.INSERT.equals(insertSpaceAfterColonInConditionalOption);
        }
        final Object insertSpaceAfterColonInForOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_FOR);
        if (insertSpaceAfterColonInForOption != null) {
            this.insert_space_after_colon_in_for = CoreOptionIDs.INSERT.equals(insertSpaceAfterColonInForOption);
        }
        final Object insertSpaceAfterColonInLabeledStatementOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_LABELED_STATEMENT);
        if (insertSpaceAfterColonInLabeledStatementOption != null) {
            this.insert_space_after_colon_in_labeled_statement = CoreOptionIDs.INSERT.equals(insertSpaceAfterColonInLabeledStatementOption);
        }
        final Object insertSpaceAfterCommaInAllocationExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ALLOCATION_EXPRESSION);
        if (insertSpaceAfterCommaInAllocationExpressionOption != null) {
            this.insert_space_after_comma_in_allocation_expression = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInAllocationExpressionOption);
        }
        final Object insertSpaceAfterCommaInAnnotationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ANNOTATION);
        if (insertSpaceAfterCommaInAnnotationOption != null) {
            this.insert_space_after_comma_in_annotation = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInAnnotationOption);
        }
        final Object insertSpaceAfterCommaInArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ARRAY_INITIALIZER);
        if (insertSpaceAfterCommaInArrayInitializerOption != null) {
            this.insert_space_after_comma_in_array_initializer = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInArrayInitializerOption);
        }
        final Object insertSpaceAfterCommaInConstructorDeclarationParametersOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_CONSTRUCTOR_DECLARATION_PARAMETERS);
        if (insertSpaceAfterCommaInConstructorDeclarationParametersOption != null) {
            this.insert_space_after_comma_in_constructor_declaration_parameters = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInConstructorDeclarationParametersOption);
        }
        final Object insertSpaceAfterCommaInConstructorDeclarationThrowsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_CONSTRUCTOR_DECLARATION_THROWS);
        if (insertSpaceAfterCommaInConstructorDeclarationThrowsOption != null) {
            this.insert_space_after_comma_in_constructor_declaration_throws = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInConstructorDeclarationThrowsOption);
        }
        final Object insertSpaceAfterCommaInEnumConstantArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ENUM_CONSTANT_ARGUMENTS);
        if (insertSpaceAfterCommaInEnumConstantArgumentsOption != null) {
            this.insert_space_after_comma_in_enum_constant_arguments = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInEnumConstantArgumentsOption);
        }
        final Object insertSpaceAfterCommaInEnumDeclarationsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ENUM_DECLARATIONS);
        if (insertSpaceAfterCommaInEnumDeclarationsOption != null) {
            this.insert_space_after_comma_in_enum_declarations = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInEnumDeclarationsOption);
        }
        final Object insertSpaceAfterCommaInExplicitConstructorCallArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_EXPLICIT_CONSTRUCTOR_CALL_ARGUMENTS);
        if (insertSpaceAfterCommaInExplicitConstructorCallArgumentsOption != null) {
            this.insert_space_after_comma_in_explicit_constructor_call_arguments = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInExplicitConstructorCallArgumentsOption);
        }
        final Object insertSpaceAfterCommaInForIncrementsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_FOR_INCREMENTS);
        if (insertSpaceAfterCommaInForIncrementsOption != null) {
            this.insert_space_after_comma_in_for_increments = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInForIncrementsOption);
        }
        final Object insertSpaceAfterCommaInForInitsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_FOR_INITS);
        if (insertSpaceAfterCommaInForInitsOption != null) {
            this.insert_space_after_comma_in_for_inits = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInForInitsOption);
        }
        final Object insertSpaceAfterCommaInMethodInvocationArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_INVOCATION_ARGUMENTS);
        if (insertSpaceAfterCommaInMethodInvocationArgumentsOption != null) {
            this.insert_space_after_comma_in_method_invocation_arguments = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInMethodInvocationArgumentsOption);
        }
        final Object insertSpaceAfterCommaInMethodDeclarationParametersOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_DECLARATION_PARAMETERS);
        if (insertSpaceAfterCommaInMethodDeclarationParametersOption != null) {
            this.insert_space_after_comma_in_method_declaration_parameters = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInMethodDeclarationParametersOption);
        }
        final Object insertSpaceAfterCommaInMethodDeclarationThrowsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_DECLARATION_THROWS);
        if (insertSpaceAfterCommaInMethodDeclarationThrowsOption != null) {
            this.insert_space_after_comma_in_method_declaration_throws = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInMethodDeclarationThrowsOption);
        }
        final Object insertSpaceAfterCommaInMultipleFieldDeclarationsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_MULTIPLE_FIELD_DECLARATIONS);
        if (insertSpaceAfterCommaInMultipleFieldDeclarationsOption != null) {
            this.insert_space_after_comma_in_multiple_field_declarations = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInMultipleFieldDeclarationsOption);
        }
        final Object insertSpaceAfterCommaInMultipleLocalDeclarationsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_MULTIPLE_LOCAL_DECLARATIONS);
        if (insertSpaceAfterCommaInMultipleLocalDeclarationsOption != null) {
            this.insert_space_after_comma_in_multiple_local_declarations = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInMultipleLocalDeclarationsOption);
        }
        final Object insertSpaceAfterCommaInParameterizedTypeReferenceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_PARAMETERIZED_TYPE_REFERENCE);
        if (insertSpaceAfterCommaInParameterizedTypeReferenceOption != null) {
            this.insert_space_after_comma_in_parameterized_type_reference = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInParameterizedTypeReferenceOption);
        }
        final Object insertSpaceAfterCommaInSuperinterfacesOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_SUPERINTERFACES);
        if (insertSpaceAfterCommaInSuperinterfacesOption != null) {
            this.insert_space_after_comma_in_superinterfaces = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInSuperinterfacesOption);
        }
        final Object insertSpaceAfterCommaInTypeArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_TYPE_ARGUMENTS);
        if (insertSpaceAfterCommaInTypeArgumentsOption != null) {
            this.insert_space_after_comma_in_type_arguments = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInTypeArgumentsOption);
        }
        final Object insertSpaceAfterCommaInTypeParametersOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_TYPE_PARAMETERS);
        if (insertSpaceAfterCommaInTypeParametersOption != null) {
            this.insert_space_after_comma_in_type_parameters = CoreOptionIDs.INSERT.equals(insertSpaceAfterCommaInTypeParametersOption);
        }
        final Object insertSpaceAfterEllipsisOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_ELLIPSIS);
        if (insertSpaceAfterEllipsisOption != null) {
            this.insert_space_after_ellipsis = CoreOptionIDs.INSERT.equals(insertSpaceAfterEllipsisOption);
        }
        final Object insertSpaceAfterOpeningAngleBracketInParameterizedTypeReferenceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_PARAMETERIZED_TYPE_REFERENCE);
        if (insertSpaceAfterOpeningAngleBracketInParameterizedTypeReferenceOption != null) {
            this.insert_space_after_opening_angle_bracket_in_parameterized_type_reference = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningAngleBracketInParameterizedTypeReferenceOption);
        }
        final Object insertSpaceAfterOpeningAngleBracketInTypeArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_TYPE_ARGUMENTS);
        if (insertSpaceAfterOpeningAngleBracketInTypeArgumentsOption != null) {
            this.insert_space_after_opening_angle_bracket_in_type_arguments = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningAngleBracketInTypeArgumentsOption);
        }
        final Object insertSpaceAfterOpeningAngleBracketInTypeParametersOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_TYPE_PARAMETERS);
        if (insertSpaceAfterOpeningAngleBracketInTypeParametersOption != null) {
            this.insert_space_after_opening_angle_bracket_in_type_parameters = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningAngleBracketInTypeParametersOption);
        }
        final Object insertSpaceAfterOpeningBracketInArrayAllocationExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACKET_IN_ARRAY_ALLOCATION_EXPRESSION);
        if (insertSpaceAfterOpeningBracketInArrayAllocationExpressionOption != null) {
            this.insert_space_after_opening_bracket_in_array_allocation_expression = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningBracketInArrayAllocationExpressionOption);
        }
        final Object insertSpaceAfterOpeningBracketInArrayReferenceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACKET_IN_ARRAY_REFERENCE);
        if (insertSpaceAfterOpeningBracketInArrayReferenceOption != null) {
            this.insert_space_after_opening_bracket_in_array_reference = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningBracketInArrayReferenceOption);
        }
        final Object insertSpaceAfterOpeningBraceInArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACE_IN_ARRAY_INITIALIZER);
        if (insertSpaceAfterOpeningBraceInArrayInitializerOption != null) {
            this.insert_space_after_opening_brace_in_array_initializer = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningBraceInArrayInitializerOption);
        }
        final Object insertSpaceAfterOpeningParenInAnnotationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_ANNOTATION);
        if (insertSpaceAfterOpeningParenInAnnotationOption != null) {
            this.insert_space_after_opening_paren_in_annotation = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInAnnotationOption);
        }
        final Object insertSpaceAfterOpeningParenInCastOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CAST);
        if (insertSpaceAfterOpeningParenInCastOption != null) {
            this.insert_space_after_opening_paren_in_cast = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInCastOption);
        }
        final Object insertSpaceAfterOpeningParenInCatchOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CATCH);
        if (insertSpaceAfterOpeningParenInCatchOption != null) {
            this.insert_space_after_opening_paren_in_catch = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInCatchOption);
        }
        final Object insertSpaceAfterOpeningParenInConstructorDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CONSTRUCTOR_DECLARATION);
        if (insertSpaceAfterOpeningParenInConstructorDeclarationOption != null) {
            this.insert_space_after_opening_paren_in_constructor_declaration = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInConstructorDeclarationOption);
        }
        final Object insertSpaceAfterOpeningParenInEnumConstantOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_ENUM_CONSTANT);
        if (insertSpaceAfterOpeningParenInEnumConstantOption != null) {
            this.insert_space_after_opening_paren_in_enum_constant = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInEnumConstantOption);
        }
        final Object insertSpaceAfterOpeningParenInForOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_FOR);
        if (insertSpaceAfterOpeningParenInForOption != null) {
            this.insert_space_after_opening_paren_in_for = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInForOption);
        }
        final Object insertSpaceAfterOpeningParenInIfOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_IF);
        if (insertSpaceAfterOpeningParenInIfOption != null) {
            this.insert_space_after_opening_paren_in_if = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInIfOption);
        }
        final Object insertSpaceAfterOpeningParenInMethodDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_METHOD_DECLARATION);
        if (insertSpaceAfterOpeningParenInMethodDeclarationOption != null) {
            this.insert_space_after_opening_paren_in_method_declaration = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInMethodDeclarationOption);
        }
        final Object insertSpaceAfterOpeningParenInMethodInvocationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_METHOD_INVOCATION);
        if (insertSpaceAfterOpeningParenInMethodInvocationOption != null) {
            this.insert_space_after_opening_paren_in_method_invocation = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInMethodInvocationOption);
        }
        final Object insertSpaceAfterOpeningParenInParenthesizedExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_PARENTHESIZED_EXPRESSION);
        if (insertSpaceAfterOpeningParenInParenthesizedExpressionOption != null) {
            this.insert_space_after_opening_paren_in_parenthesized_expression = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInParenthesizedExpressionOption);
        }
        final Object insertSpaceAfterOpeningParenInSwitchOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_SWITCH);
        if (insertSpaceAfterOpeningParenInSwitchOption != null) {
            this.insert_space_after_opening_paren_in_switch = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInSwitchOption);
        }
        final Object insertSpaceAfterOpeningParenInSynchronizedOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_SYNCHRONIZED);
        if (insertSpaceAfterOpeningParenInSynchronizedOption != null) {
            this.insert_space_after_opening_paren_in_synchronized = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInSynchronizedOption);
        }
        final Object insertSpaceAfterOpeningParenInWhileOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_WHILE);
        if (insertSpaceAfterOpeningParenInWhileOption != null) {
            this.insert_space_after_opening_paren_in_while = CoreOptionIDs.INSERT.equals(insertSpaceAfterOpeningParenInWhileOption);
        }
        final Object insertSpaceAfterPostfixOperatorOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_POSTFIX_OPERATOR);
        if (insertSpaceAfterPostfixOperatorOption != null) {
            this.insert_space_after_postfix_operator = CoreOptionIDs.INSERT.equals(insertSpaceAfterPostfixOperatorOption);
        }
        final Object insertSpaceAfterPrefixOperatorOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_PREFIX_OPERATOR);
        if (insertSpaceAfterPrefixOperatorOption != null) {
            this.insert_space_after_prefix_operator = CoreOptionIDs.INSERT.equals(insertSpaceAfterPrefixOperatorOption);
        }
        final Object insertSpaceAfterQuestionInConditionalOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_QUESTION_IN_CONDITIONAL);
        if (insertSpaceAfterQuestionInConditionalOption != null) {
            this.insert_space_after_question_in_conditional = CoreOptionIDs.INSERT.equals(insertSpaceAfterQuestionInConditionalOption);
        }
        final Object insertSpaceAfterQuestionInWildcardOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_QUESTION_IN_WILDCARD);
        if (insertSpaceAfterQuestionInWildcardOption != null) {
            this.insert_space_after_question_in_wilcard = CoreOptionIDs.INSERT.equals(insertSpaceAfterQuestionInWildcardOption);
        }
        final Object insertSpaceAfterSemicolonInForOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_SEMICOLON_IN_FOR);
        if (insertSpaceAfterSemicolonInForOption != null) {
            this.insert_space_after_semicolon_in_for = CoreOptionIDs.INSERT.equals(insertSpaceAfterSemicolonInForOption);
        }
        final Object insertSpaceAfterUnaryOperatorOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_UNARY_OPERATOR);
        if (insertSpaceAfterUnaryOperatorOption != null) {
            this.insert_space_after_unary_operator = CoreOptionIDs.INSERT.equals(insertSpaceAfterUnaryOperatorOption);
        }
        final Object insertSpaceBeforeAndInWildcardOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_AND_IN_TYPE_PARAMETER);
        if (insertSpaceBeforeAndInWildcardOption != null) {
            this.insert_space_before_and_in_type_parameter = CoreOptionIDs.INSERT.equals(insertSpaceBeforeAndInWildcardOption);
        }
        final Object insertSpaceBeforeAtInAnnotationTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_AT_IN_ANNOTATION_TYPE_DECLARATION);
        if (insertSpaceBeforeAtInAnnotationTypeDeclarationOption != null) {
            this.insert_space_before_at_in_annotation_type_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeAtInAnnotationTypeDeclarationOption);
        }
        final Object insertSpaceBeforeAssignmentOperatorOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_ASSIGNMENT_OPERATOR);
        if (insertSpaceBeforeAssignmentOperatorOption != null) {
            this.insert_space_before_assignment_operator = CoreOptionIDs.INSERT.equals(insertSpaceBeforeAssignmentOperatorOption);
        }
        final Object insertSpaceBeforeBinaryOperatorOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_BINARY_OPERATOR);
        if (insertSpaceBeforeBinaryOperatorOption != null) {
            this.insert_space_before_binary_operator = CoreOptionIDs.INSERT.equals(insertSpaceBeforeBinaryOperatorOption);
        }
        final Object insertSpaceBeforeClosingAngleBracketInParameterizedTypeReferenceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_PARAMETERIZED_TYPE_REFERENCE);
        if (insertSpaceBeforeClosingAngleBracketInParameterizedTypeReferenceOption != null) {
            this.insert_space_before_closing_angle_bracket_in_parameterized_type_reference = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingAngleBracketInParameterizedTypeReferenceOption);
        }
        final Object insertSpaceBeforeClosingAngleBracketInTypeArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_TYPE_ARGUMENTS);
        if (insertSpaceBeforeClosingAngleBracketInTypeArgumentsOption != null) {
            this.insert_space_before_closing_angle_bracket_in_type_arguments = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingAngleBracketInTypeArgumentsOption);
        }
        final Object insertSpaceBeforeClosingAngleBracketInTypeParametersOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_TYPE_PARAMETERS);
        if (insertSpaceBeforeClosingAngleBracketInTypeParametersOption != null) {
            this.insert_space_before_closing_angle_bracket_in_type_parameters = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingAngleBracketInTypeParametersOption);
        }
        final Object insertSpaceBeforeClosingBraceInArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACE_IN_ARRAY_INITIALIZER);
        if (insertSpaceBeforeClosingBraceInArrayInitializerOption != null) {
            this.insert_space_before_closing_brace_in_array_initializer = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingBraceInArrayInitializerOption);
        }
        final Object insertSpaceBeforeClosingBracketInArrayAllocationExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACKET_IN_ARRAY_ALLOCATION_EXPRESSION);
        if (insertSpaceBeforeClosingBracketInArrayAllocationExpressionOption != null) {
            this.insert_space_before_closing_bracket_in_array_allocation_expression = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingBracketInArrayAllocationExpressionOption);
        }
        final Object insertSpaceBeforeClosingBracketInArrayReferenceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACKET_IN_ARRAY_REFERENCE);
        if (insertSpaceBeforeClosingBracketInArrayReferenceOption != null) {
            this.insert_space_before_closing_bracket_in_array_reference = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingBracketInArrayReferenceOption);
        }
        final Object insertSpaceBeforeClosingParenInAnnotationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_ANNOTATION);
        if (insertSpaceBeforeClosingParenInAnnotationOption != null) {
            this.insert_space_before_closing_paren_in_annotation = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInAnnotationOption);
        }
        final Object insertSpaceBeforeClosingParenInCastOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CAST);
        if (insertSpaceBeforeClosingParenInCastOption != null) {
            this.insert_space_before_closing_paren_in_cast = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInCastOption);
        }
        final Object insertSpaceBeforeClosingParenInCatchOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CATCH);
        if (insertSpaceBeforeClosingParenInCatchOption != null) {
            this.insert_space_before_closing_paren_in_catch = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInCatchOption);
        }
        final Object insertSpaceBeforeClosingParenInConstructorDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CONSTRUCTOR_DECLARATION);
        if (insertSpaceBeforeClosingParenInConstructorDeclarationOption != null) {
            this.insert_space_before_closing_paren_in_constructor_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInConstructorDeclarationOption);
        }
        final Object insertSpaceBeforeClosingParenInEnumConstantOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_ENUM_CONSTANT);
        if (insertSpaceBeforeClosingParenInEnumConstantOption != null) {
            this.insert_space_before_closing_paren_in_enum_constant = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInEnumConstantOption);
        }
        final Object insertSpaceBeforeClosingParenInForOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_FOR);
        if (insertSpaceBeforeClosingParenInForOption != null) {
            this.insert_space_before_closing_paren_in_for = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInForOption);
        }
        final Object insertSpaceBeforeClosingParenInIfOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_IF);
        if (insertSpaceBeforeClosingParenInIfOption != null) {
            this.insert_space_before_closing_paren_in_if = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInIfOption);
        }
        final Object insertSpaceBeforeClosingParenInMethodDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_METHOD_DECLARATION);
        if (insertSpaceBeforeClosingParenInMethodDeclarationOption != null) {
            this.insert_space_before_closing_paren_in_method_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInMethodDeclarationOption);
        }
        final Object insertSpaceBeforeClosingParenInMethodInvocationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_METHOD_INVOCATION);
        if (insertSpaceBeforeClosingParenInMethodInvocationOption != null) {
            this.insert_space_before_closing_paren_in_method_invocation = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInMethodInvocationOption);
        }
        final Object insertSpaceBeforeClosingParenInParenthesizedExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_PARENTHESIZED_EXPRESSION);
        if (insertSpaceBeforeClosingParenInParenthesizedExpressionOption != null) {
            this.insert_space_before_closing_paren_in_parenthesized_expression = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInParenthesizedExpressionOption);
        }
        final Object insertSpaceBeforeClosingParenInSwitchOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_SWITCH);
        if (insertSpaceBeforeClosingParenInSwitchOption != null) {
            this.insert_space_before_closing_paren_in_switch = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInSwitchOption);
        }
        final Object insertSpaceBeforeClosingParenInSynchronizedOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_SYNCHRONIZED);
        if (insertSpaceBeforeClosingParenInSynchronizedOption != null) {
            this.insert_space_before_closing_paren_in_synchronized = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInSynchronizedOption);
        }
        final Object insertSpaceBeforeClosingParenInWhileOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_WHILE);
        if (insertSpaceBeforeClosingParenInWhileOption != null) {
            this.insert_space_before_closing_paren_in_while = CoreOptionIDs.INSERT.equals(insertSpaceBeforeClosingParenInWhileOption);
        }
        final Object insertSpaceBeforeColonInAssertOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_ASSERT);
        if (insertSpaceBeforeColonInAssertOption != null) {
            this.insert_space_before_colon_in_assert = CoreOptionIDs.INSERT.equals(insertSpaceBeforeColonInAssertOption);
        }
        final Object insertSpaceBeforeColonInCaseOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_CASE);
        if (insertSpaceBeforeColonInCaseOption != null) {
            this.insert_space_before_colon_in_case = CoreOptionIDs.INSERT.equals(insertSpaceBeforeColonInCaseOption);
        }
        final Object insertSpaceBeforeColonInConditionalOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_CONDITIONAL);
        if (insertSpaceBeforeColonInConditionalOption != null) {
            this.insert_space_before_colon_in_conditional = CoreOptionIDs.INSERT.equals(insertSpaceBeforeColonInConditionalOption);
        }
        final Object insertSpaceBeforeColonInDefaultOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_DEFAULT);
        if (insertSpaceBeforeColonInDefaultOption != null) {
            this.insert_space_before_colon_in_default = CoreOptionIDs.INSERT.equals(insertSpaceBeforeColonInDefaultOption);
        }
        final Object insertSpaceBeforeColonInForOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_FOR);
        if (insertSpaceBeforeColonInForOption != null) {
            this.insert_space_before_colon_in_for = CoreOptionIDs.INSERT.equals(insertSpaceBeforeColonInForOption);
        }
        final Object insertSpaceBeforeColonInLabeledStatementOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_LABELED_STATEMENT);
        if (insertSpaceBeforeColonInLabeledStatementOption != null) {
            this.insert_space_before_colon_in_labeled_statement = CoreOptionIDs.INSERT.equals(insertSpaceBeforeColonInLabeledStatementOption);
        }
        final Object insertSpaceBeforeCommaInAllocationExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ALLOCATION_EXPRESSION);
        if (insertSpaceBeforeCommaInAllocationExpressionOption != null) {
            this.insert_space_before_comma_in_allocation_expression = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInAllocationExpressionOption);
        }
        final Object insertSpaceBeforeCommaInAnnotationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ANNOTATION);
        if (insertSpaceBeforeCommaInAnnotationOption != null) {
            this.insert_space_before_comma_in_annotation = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInAnnotationOption);
        }
        final Object insertSpaceBeforeCommaInArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ARRAY_INITIALIZER);
        if (insertSpaceBeforeCommaInArrayInitializerOption != null) {
            this.insert_space_before_comma_in_array_initializer = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInArrayInitializerOption);
        }
        final Object insertSpaceBeforeCommaInConstructorDeclarationParametersOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_CONSTRUCTOR_DECLARATION_PARAMETERS);
        if (insertSpaceBeforeCommaInConstructorDeclarationParametersOption != null) {
            this.insert_space_before_comma_in_constructor_declaration_parameters = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInConstructorDeclarationParametersOption);
        }
        final Object insertSpaceBeforeCommaInConstructorDeclarationThrowsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_CONSTRUCTOR_DECLARATION_THROWS);
        if (insertSpaceBeforeCommaInConstructorDeclarationThrowsOption != null) {
            this.insert_space_before_comma_in_constructor_declaration_throws = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInConstructorDeclarationThrowsOption);
        }
        final Object insertSpaceBeforeCommaInEnumConstantArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ENUM_CONSTANT_ARGUMENTS);
        if (insertSpaceBeforeCommaInEnumConstantArgumentsOption != null) {
            this.insert_space_before_comma_in_enum_constant_arguments = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInEnumConstantArgumentsOption);
        }
        final Object insertSpaceBeforeCommaInEnumDeclarationsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ENUM_DECLARATIONS);
        if (insertSpaceBeforeCommaInEnumDeclarationsOption != null) {
            this.insert_space_before_comma_in_enum_declarations = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInEnumDeclarationsOption);
        }
        final Object insertSpaceBeforeCommaInExplicitConstructorCallArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_EXPLICIT_CONSTRUCTOR_CALL_ARGUMENTS);
        if (insertSpaceBeforeCommaInExplicitConstructorCallArgumentsOption != null) {
            this.insert_space_before_comma_in_explicit_constructor_call_arguments = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInExplicitConstructorCallArgumentsOption);
        }
        final Object insertSpaceBeforeCommaInForIncrementsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_FOR_INCREMENTS);
        if (insertSpaceBeforeCommaInForIncrementsOption != null) {
            this.insert_space_before_comma_in_for_increments = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInForIncrementsOption);
        }
        final Object insertSpaceBeforeCommaInForInitsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_FOR_INITS);
        if (insertSpaceBeforeCommaInForInitsOption != null) {
            this.insert_space_before_comma_in_for_inits = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInForInitsOption);
        }
        final Object insertSpaceBeforeCommaInMethodInvocationArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_INVOCATION_ARGUMENTS);
        if (insertSpaceBeforeCommaInMethodInvocationArgumentsOption != null) {
            this.insert_space_before_comma_in_method_invocation_arguments = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInMethodInvocationArgumentsOption);
        }
        final Object insertSpaceBeforeCommaInMethodDeclarationParametersOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_DECLARATION_PARAMETERS);
        if (insertSpaceBeforeCommaInMethodDeclarationParametersOption != null) {
            this.insert_space_before_comma_in_method_declaration_parameters = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInMethodDeclarationParametersOption);
        }
        final Object insertSpaceBeforeCommaInMethodDeclarationThrowsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_DECLARATION_THROWS);
        if (insertSpaceBeforeCommaInMethodDeclarationThrowsOption != null) {
            this.insert_space_before_comma_in_method_declaration_throws = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInMethodDeclarationThrowsOption);
        }
        final Object insertSpaceBeforeCommaInMultipleFieldDeclarationsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_MULTIPLE_FIELD_DECLARATIONS);
        if (insertSpaceBeforeCommaInMultipleFieldDeclarationsOption != null) {
            this.insert_space_before_comma_in_multiple_field_declarations = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInMultipleFieldDeclarationsOption);
        }
        final Object insertSpaceBeforeCommaInMultipleLocalDeclarationsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_MULTIPLE_LOCAL_DECLARATIONS);
        if (insertSpaceBeforeCommaInMultipleLocalDeclarationsOption != null) {
            this.insert_space_before_comma_in_multiple_local_declarations = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInMultipleLocalDeclarationsOption);
        }
        final Object insertSpaceBeforeCommaInParameterizedTypeReferenceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_PARAMETERIZED_TYPE_REFERENCE);
        if (insertSpaceBeforeCommaInParameterizedTypeReferenceOption != null) {
            this.insert_space_before_comma_in_parameterized_type_reference = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInParameterizedTypeReferenceOption);
        }
        final Object insertSpaceBeforeCommaInSuperinterfacesOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_SUPERINTERFACES);
        if (insertSpaceBeforeCommaInSuperinterfacesOption != null) {
            this.insert_space_before_comma_in_superinterfaces = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInSuperinterfacesOption);
        }
        final Object insertSpaceBeforeCommaInTypeArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_TYPE_ARGUMENTS);
        if (insertSpaceBeforeCommaInTypeArgumentsOption != null) {
            this.insert_space_before_comma_in_type_arguments = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInTypeArgumentsOption);
        }
        final Object insertSpaceBeforeCommaInTypeParametersOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_TYPE_PARAMETERS);
        if (insertSpaceBeforeCommaInTypeParametersOption != null) {
            this.insert_space_before_comma_in_type_parameters = CoreOptionIDs.INSERT.equals(insertSpaceBeforeCommaInTypeParametersOption);
        }
        final Object insertSpaceBeforeEllipsisOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_ELLIPSIS);
        if (insertSpaceBeforeEllipsisOption != null) {
            this.insert_space_before_ellipsis = CoreOptionIDs.INSERT.equals(insertSpaceBeforeEllipsisOption);
        }
        final Object insertSpaceBeforeOpeningAngleBrackerInParameterizedTypeReferenceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_PARAMETERIZED_TYPE_REFERENCE);
        if (insertSpaceBeforeOpeningAngleBrackerInParameterizedTypeReferenceOption != null) {
            this.insert_space_before_opening_angle_bracket_in_parameterized_type_reference = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningAngleBrackerInParameterizedTypeReferenceOption);
        }
        final Object insertSpaceBeforeOpeningAngleBrackerInTypeArgumentsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_TYPE_ARGUMENTS);
        if (insertSpaceBeforeOpeningAngleBrackerInTypeArgumentsOption != null) {
            this.insert_space_before_opening_angle_bracket_in_type_arguments = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningAngleBrackerInTypeArgumentsOption);
        }
        final Object insertSpaceBeforeOpeningAngleBrackerInTypeParametersOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_TYPE_PARAMETERS);
        if (insertSpaceBeforeOpeningAngleBrackerInTypeParametersOption != null) {
            this.insert_space_before_opening_angle_bracket_in_type_parameters = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningAngleBrackerInTypeParametersOption);
        }
        final Object insertSpaceBeforeOpeningBraceInAnnotationTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_ANNOTATION_TYPE_DECLARATION);
        if (insertSpaceBeforeOpeningBraceInAnnotationTypeDeclarationOption != null) {
            this.insert_space_before_opening_brace_in_annotation_type_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBraceInAnnotationTypeDeclarationOption);
        }
        final Object insertSpaceBeforeOpeningBraceInAnonymousTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_ANONYMOUS_TYPE_DECLARATION);
        if (insertSpaceBeforeOpeningBraceInAnonymousTypeDeclarationOption != null) {
            this.insert_space_before_opening_brace_in_anonymous_type_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBraceInAnonymousTypeDeclarationOption);
        }
        final Object insertSpaceBeforeOpeningBraceInArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_ARRAY_INITIALIZER);
        if (insertSpaceBeforeOpeningBraceInArrayInitializerOption != null) {
            this.insert_space_before_opening_brace_in_array_initializer = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBraceInArrayInitializerOption);
        }
        final Object insertSpaceBeforeOpeningBraceInBlockOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_BLOCK);
        if (insertSpaceBeforeOpeningBraceInBlockOption != null) {
            this.insert_space_before_opening_brace_in_block = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBraceInBlockOption);
        }
        final Object insertSpaceBeforeOpeningBraceInConstructorDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_CONSTRUCTOR_DECLARATION);
        if (insertSpaceBeforeOpeningBraceInConstructorDeclarationOption != null) {
            this.insert_space_before_opening_brace_in_constructor_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBraceInConstructorDeclarationOption);
        }
        final Object insertSpaceBeforeOpeningBraceInEnumDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_ENUM_DECLARATION);
        if (insertSpaceBeforeOpeningBraceInEnumDeclarationOption != null) {
            this.insert_space_before_opening_brace_in_enum_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBraceInEnumDeclarationOption);
        }
        final Object insertSpaceBeforeOpeningBraceInEnumConstantOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_ENUM_CONSTANT);
        if (insertSpaceBeforeOpeningBraceInEnumConstantOption != null) {
            this.insert_space_before_opening_brace_in_enum_constant = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBraceInEnumConstantOption);
        }
        final Object insertSpaceBeforeOpeningBraceInMethodDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_METHOD_DECLARATION);
        if (insertSpaceBeforeOpeningBraceInMethodDeclarationOption != null) {
            this.insert_space_before_opening_brace_in_method_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBraceInMethodDeclarationOption);
        }
        final Object insertSpaceBeforeOpeningBraceInTypeDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_TYPE_DECLARATION);
        if (insertSpaceBeforeOpeningBraceInTypeDeclarationOption != null) {
            this.insert_space_before_opening_brace_in_type_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBraceInTypeDeclarationOption);
        }
        final Object insertSpaceBeforeOpeningBracketInArrayAllocationExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACKET_IN_ARRAY_ALLOCATION_EXPRESSION);
        if (insertSpaceBeforeOpeningBracketInArrayAllocationExpressionOption != null) {
            this.insert_space_before_opening_bracket_in_array_allocation_expression = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBracketInArrayAllocationExpressionOption);
        }
        final Object insertSpaceBeforeOpeningBracketInArrayReferenceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACKET_IN_ARRAY_REFERENCE);
        if (insertSpaceBeforeOpeningBracketInArrayReferenceOption != null) {
            this.insert_space_before_opening_bracket_in_array_reference = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBracketInArrayReferenceOption);
        }
        final Object insertSpaceBeforeOpeningBracketInArrayTypeReferenceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACKET_IN_ARRAY_TYPE_REFERENCE);
        if (insertSpaceBeforeOpeningBracketInArrayTypeReferenceOption != null) {
            this.insert_space_before_opening_bracket_in_array_type_reference = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBracketInArrayTypeReferenceOption);
        }
        final Object insertSpaceBeforeOpeningParenInAnnotationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_ANNOTATION);
        if (insertSpaceBeforeOpeningParenInAnnotationOption != null) {
            this.insert_space_before_opening_paren_in_annotation = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInAnnotationOption);
        }
        final Object insertSpaceBeforeOpeningParenInAnnotationTypeMemberDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_ANNOTATION_TYPE_MEMBER_DECLARATION);
        if (insertSpaceBeforeOpeningParenInAnnotationTypeMemberDeclarationOption != null) {
            this.insert_space_before_opening_paren_in_annotation_type_member_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInAnnotationTypeMemberDeclarationOption);
        }
        final Object insertSpaceBeforeOpeningParenInCatchOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_CATCH);
        if (insertSpaceBeforeOpeningParenInCatchOption != null) {
            this.insert_space_before_opening_paren_in_catch = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInCatchOption);
        }
        final Object insertSpaceBeforeOpeningParenInConstructorDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_CONSTRUCTOR_DECLARATION);
        if (insertSpaceBeforeOpeningParenInConstructorDeclarationOption != null) {
            this.insert_space_before_opening_paren_in_constructor_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInConstructorDeclarationOption);
        }
        final Object insertSpaceBeforeOpeningParenInEnumConstantOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_ENUM_CONSTANT);
        if (insertSpaceBeforeOpeningParenInEnumConstantOption != null) {
            this.insert_space_before_opening_paren_in_enum_constant = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInEnumConstantOption);
        }
        final Object insertSpaceBeforeOpeningParenInForOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_FOR);
        if (insertSpaceBeforeOpeningParenInForOption != null) {
            this.insert_space_before_opening_paren_in_for = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInForOption);
        }
        final Object insertSpaceBeforeOpeningParenInIfOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_IF);
        if (insertSpaceBeforeOpeningParenInIfOption != null) {
            this.insert_space_before_opening_paren_in_if = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInIfOption);
        }
        final Object insertSpaceBeforeOpeningParenInMethodInvocationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_METHOD_INVOCATION);
        if (insertSpaceBeforeOpeningParenInMethodInvocationOption != null) {
            this.insert_space_before_opening_paren_in_method_invocation = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInMethodInvocationOption);
        }
        final Object insertSpaceBeforeOpeningParenInMethodDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_METHOD_DECLARATION);
        if (insertSpaceBeforeOpeningParenInMethodDeclarationOption != null) {
            this.insert_space_before_opening_paren_in_method_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInMethodDeclarationOption);
        }
        final Object insertSpaceBeforeOpeningParenInSwitchOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_SWITCH);
        if (insertSpaceBeforeOpeningParenInSwitchOption != null) {
            this.insert_space_before_opening_paren_in_switch = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInSwitchOption);
        }
        final Object insertSpaceBeforeOpeningBraceInSwitchOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_SWITCH);
        if (insertSpaceBeforeOpeningBraceInSwitchOption != null) {
            this.insert_space_before_opening_brace_in_switch = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningBraceInSwitchOption);
        }
        final Object insertSpaceBeforeOpeningParenInSynchronizedOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_SYNCHRONIZED);
        if (insertSpaceBeforeOpeningParenInSynchronizedOption != null) {
            this.insert_space_before_opening_paren_in_synchronized = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInSynchronizedOption);
        }
        final Object insertSpaceBeforeOpeningParenInParenthesizedExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_PARENTHESIZED_EXPRESSION);
        if (insertSpaceBeforeOpeningParenInParenthesizedExpressionOption != null) {
            this.insert_space_before_opening_paren_in_parenthesized_expression = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInParenthesizedExpressionOption);
        }
        final Object insertSpaceBeforeOpeningParenInWhileOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_WHILE);
        if (insertSpaceBeforeOpeningParenInWhileOption != null) {
            this.insert_space_before_opening_paren_in_while = CoreOptionIDs.INSERT.equals(insertSpaceBeforeOpeningParenInWhileOption);
        }
        final Object insertSpaceBeforePostfixOperatorOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_POSTFIX_OPERATOR);
        if (insertSpaceBeforePostfixOperatorOption != null) {
            this.insert_space_before_postfix_operator = CoreOptionIDs.INSERT.equals(insertSpaceBeforePostfixOperatorOption);
        }
        final Object insertSpaceBeforePrefixOperatorOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_PREFIX_OPERATOR);
        if (insertSpaceBeforePrefixOperatorOption != null) {
            this.insert_space_before_prefix_operator = CoreOptionIDs.INSERT.equals(insertSpaceBeforePrefixOperatorOption);
        }
        final Object insertSpaceBeforeQuestionInConditionalOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_QUESTION_IN_CONDITIONAL);
        if (insertSpaceBeforeQuestionInConditionalOption != null) {
            this.insert_space_before_question_in_conditional = CoreOptionIDs.INSERT.equals(insertSpaceBeforeQuestionInConditionalOption);
        }
        final Object insertSpaceBeforeQuestionInWildcardOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_QUESTION_IN_WILDCARD);
        if (insertSpaceBeforeQuestionInWildcardOption != null) {
            this.insert_space_before_question_in_wilcard = CoreOptionIDs.INSERT.equals(insertSpaceBeforeQuestionInWildcardOption);
        }
        final Object insertSpaceBeforeSemicolonOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_SEMICOLON);
        if (insertSpaceBeforeSemicolonOption != null) {
            this.insert_space_before_semicolon = CoreOptionIDs.INSERT.equals(insertSpaceBeforeSemicolonOption);
        }
        final Object insertSpaceBeforeSemicolonInForOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_SEMICOLON_IN_FOR);
        if (insertSpaceBeforeSemicolonInForOption != null) {
            this.insert_space_before_semicolon_in_for = CoreOptionIDs.INSERT.equals(insertSpaceBeforeSemicolonInForOption);
        }
        final Object insertSpaceBeforeUnaryOperatorOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_UNARY_OPERATOR);
        if (insertSpaceBeforeUnaryOperatorOption != null) {
            this.insert_space_before_unary_operator = CoreOptionIDs.INSERT.equals(insertSpaceBeforeUnaryOperatorOption);
        }
        final Object insertSpaceBetweenBracketsInArrayTypeReferenceOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_BRACKETS_IN_ARRAY_TYPE_REFERENCE);
        if (insertSpaceBetweenBracketsInArrayTypeReferenceOption != null) {
            this.insert_space_between_brackets_in_array_type_reference = CoreOptionIDs.INSERT.equals(insertSpaceBetweenBracketsInArrayTypeReferenceOption);
        }
        final Object insertSpaceBetweenEmptyBracesInArrayInitializerOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_BRACES_IN_ARRAY_INITIALIZER);
        if (insertSpaceBetweenEmptyBracesInArrayInitializerOption != null) {
            this.insert_space_between_empty_braces_in_array_initializer = CoreOptionIDs.INSERT.equals(insertSpaceBetweenEmptyBracesInArrayInitializerOption);
        }
        final Object insertSpaceBetweenEmptyBracketsInArrayAllocationExpressionOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_BRACKETS_IN_ARRAY_ALLOCATION_EXPRESSION);
        if (insertSpaceBetweenEmptyBracketsInArrayAllocationExpressionOption != null) {
            this.insert_space_between_empty_brackets_in_array_allocation_expression = CoreOptionIDs.INSERT.equals(insertSpaceBetweenEmptyBracketsInArrayAllocationExpressionOption);
        }
        final Object insertSpaceBetweenEmptyParensInConstructorDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_CONSTRUCTOR_DECLARATION);
        if (insertSpaceBetweenEmptyParensInConstructorDeclarationOption != null) {
            this.insert_space_between_empty_parens_in_constructor_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBetweenEmptyParensInConstructorDeclarationOption);
        }
        final Object insertSpaceBetweenEmptyParensInAnnotationTypeMemberDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_ANNOTATION_TYPE_MEMBER_DECLARATION);
        if (insertSpaceBetweenEmptyParensInAnnotationTypeMemberDeclarationOption != null) {
            this.insert_space_between_empty_parens_in_annotation_type_member_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBetweenEmptyParensInAnnotationTypeMemberDeclarationOption);
        }
        final Object insertSpaceBetweenEmptyParensInEnumConstantOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_ENUM_CONSTANT);
        if (insertSpaceBetweenEmptyParensInEnumConstantOption != null) {
            this.insert_space_between_empty_parens_in_enum_constant = CoreOptionIDs.INSERT.equals(insertSpaceBetweenEmptyParensInEnumConstantOption);
        }
        final Object insertSpaceBetweenEmptyParensInMethodDeclarationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_METHOD_DECLARATION);
        if (insertSpaceBetweenEmptyParensInMethodDeclarationOption != null) {
            this.insert_space_between_empty_parens_in_method_declaration = CoreOptionIDs.INSERT.equals(insertSpaceBetweenEmptyParensInMethodDeclarationOption);
        }
        final Object insertSpaceBetweenEmptyParensInMethodInvocationOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_METHOD_INVOCATION);
        if (insertSpaceBetweenEmptyParensInMethodInvocationOption != null) {
            this.insert_space_between_empty_parens_in_method_invocation = CoreOptionIDs.INSERT.equals(insertSpaceBetweenEmptyParensInMethodInvocationOption);
        }
        final Object compactElseIfOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_COMPACT_ELSE_IF);
        if (compactElseIfOption != null) {
            this.compact_else_if = DefaultCodeFormatterConstants.TRUE.equals(compactElseIfOption);
        }
        final Object keepGuardianClauseOnOneLineOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_KEEP_GUARDIAN_CLAUSE_ON_ONE_LINE);
        if (keepGuardianClauseOnOneLineOption != null) {
            this.keep_guardian_clause_on_one_line = DefaultCodeFormatterConstants.TRUE.equals(keepGuardianClauseOnOneLineOption);
        }
        final Object keepElseStatementOnSameLineOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_KEEP_ELSE_STATEMENT_ON_SAME_LINE);
        if (keepElseStatementOnSameLineOption != null) {
            this.keep_else_statement_on_same_line = DefaultCodeFormatterConstants.TRUE.equals(keepElseStatementOnSameLineOption);
        }
        final Object keepEmptyArrayInitializerOnOneLineOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_KEEP_EMPTY_ARRAY_INITIALIZER_ON_ONE_LINE);
        if (keepEmptyArrayInitializerOnOneLineOption != null) {
            this.keep_empty_array_initializer_on_one_line = DefaultCodeFormatterConstants.TRUE.equals(keepEmptyArrayInitializerOnOneLineOption);
        }
        final Object keepSimpleIfOnOneLineOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_KEEP_SIMPLE_IF_ON_ONE_LINE);
        if (keepSimpleIfOnOneLineOption != null) {
            this.keep_simple_if_on_one_line = DefaultCodeFormatterConstants.TRUE.equals(keepSimpleIfOnOneLineOption);
        }
        final Object keepThenStatementOnSameLineOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_KEEP_THEN_STATEMENT_ON_SAME_LINE);
        if (keepThenStatementOnSameLineOption != null) {
            this.keep_then_statement_on_same_line = DefaultCodeFormatterConstants.TRUE.equals(keepThenStatementOnSameLineOption);
        }
        final Object numberOfEmptyLinesToPreserveOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_NUMBER_OF_EMPTY_LINES_TO_PRESERVE);
        if (numberOfEmptyLinesToPreserveOption != null) {
            try {
                this.number_of_empty_lines_to_preserve = Integer.parseInt((String) numberOfEmptyLinesToPreserveOption);
            } catch (NumberFormatException e) {
                this.number_of_empty_lines_to_preserve = 0;
            } catch(ClassCastException e) {
                this.number_of_empty_lines_to_preserve = 0;
            }
        }
        final Object putEmptyStatementOnNewLineOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_PUT_EMPTY_STATEMENT_ON_NEW_LINE);
        if (putEmptyStatementOnNewLineOption != null) {
            this.put_empty_statement_on_new_line = DefaultCodeFormatterConstants.TRUE.equals(putEmptyStatementOnNewLineOption);
        }
        final Object tabSizeOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE);
        if (tabSizeOption != null) {
            try {
                this.tab_size = Integer.parseInt((String) tabSizeOption);
            } catch (NumberFormatException e) {
                this.tab_size = 4;
            } catch(ClassCastException e) {
                this.tab_size = 4;
            }
        }
        final Object useTabsOnlyForLeadingIndentationsOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_USE_TABS_ONLY_FOR_LEADING_INDENTATIONS);
        if (useTabsOnlyForLeadingIndentationsOption != null) {
            this.use_tabs_only_for_leading_indentations = DefaultCodeFormatterConstants.TRUE.equals(useTabsOnlyForLeadingIndentationsOption);
        }
        final Object pageWidthOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_LINE_SPLIT);
        if (pageWidthOption != null) {
            try {
                this.page_width = Integer.parseInt((String) pageWidthOption);
            } catch (NumberFormatException e) {
                this.page_width = 80;
            } catch(ClassCastException e) {
                this.page_width = 80;
            }
        }
        final Object useTabOption = settings.get(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR);
        if (useTabOption != null) {
            if (CoreOptionIDs.TAB.equals(useTabOption)) {
                this.tab_char = TAB;
            } else if (CoreOptionIDs.SPACE.equals(useTabOption)) {
                this.tab_char = SPACE;
            } else {
                this.tab_char = MIXED;
            }
        }
    }
    
    public void setDefaultSettings() {
        this.alignment_for_arguments_in_allocation_expression = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_arguments_in_enum_constant = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_arguments_in_explicit_constructor_call = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_arguments_in_method_invocation = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_arguments_in_qualified_allocation_expression = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_binary_expression = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_compact_if = Alignment.M_ONE_PER_LINE_SPLIT | Alignment.M_INDENT_BY_ONE;
        this.alignment_for_conditional_expression = Alignment.M_ONE_PER_LINE_SPLIT;
        this.alignment_for_enum_constants = Alignment.NONE;
        this.alignment_for_expressions_in_array_initializer = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_multiple_fields = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_parameters_in_constructor_declaration = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_parameters_in_method_declaration = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_selector_in_method_invocation = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_superclass_in_type_declaration = Alignment.M_NEXT_SHIFTED_SPLIT;
        this.alignment_for_superinterfaces_in_enum_declaration = Alignment.M_NEXT_SHIFTED_SPLIT;
        this.alignment_for_superinterfaces_in_type_declaration = Alignment.M_NEXT_SHIFTED_SPLIT;
        this.alignment_for_throws_clause_in_constructor_declaration = Alignment.M_COMPACT_SPLIT;
        this.alignment_for_throws_clause_in_method_declaration = Alignment.M_COMPACT_SPLIT;
        this.align_type_members_on_columns = false;
        this.brace_position_for_annotation_type_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
        this.brace_position_for_anonymous_type_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
        this.brace_position_for_array_initializer = DefaultCodeFormatterConstants.END_OF_LINE;
        this.brace_position_for_block = DefaultCodeFormatterConstants.END_OF_LINE;
        this.brace_position_for_block_in_case = DefaultCodeFormatterConstants.END_OF_LINE;
        this.brace_position_for_constructor_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
        this.brace_position_for_enum_constant = DefaultCodeFormatterConstants.END_OF_LINE;
        this.brace_position_for_enum_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
        this.brace_position_for_method_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
        this.brace_position_for_type_declaration = DefaultCodeFormatterConstants.END_OF_LINE;
        this.brace_position_for_switch = DefaultCodeFormatterConstants.END_OF_LINE;
        this.comment_clear_blank_lines = false;
        this.comment_format = true;
        this.comment_format_header = false;
        this.comment_format_html = true;
        this.comment_format_source = true;
        this.comment_indent_parameter_description = true;
        this.comment_indent_root_tags = true;
        this.comment_insert_empty_line_before_root_tags = true;
        this.comment_insert_new_line_for_parameter = true;
        this.comment_line_length = 80;
        this.continuation_indentation = 1;
        this.continuation_indentation_for_array_initializer = 1;
        this.blank_lines_after_imports = 0;
        this.blank_lines_after_package = 0;
        this.blank_lines_before_field = 0;
        this.blank_lines_before_first_class_body_declaration = 0;
        this.blank_lines_before_imports = 0;
        this.blank_lines_before_member_type = 0;
        this.blank_lines_before_method = 0;
        this.blank_lines_before_new_chunk = 0;
        this.blank_lines_before_package = 0;
        this.blank_lines_between_type_declarations = 0;
        this.blank_lines_at_beginning_of_method_body = 0;
        this.indent_statements_compare_to_block = true;
        this.indent_statements_compare_to_body = true;
        this.indent_body_declarations_compare_to_enum_constant_header = true;
        this.indent_body_declarations_compare_to_enum_declaration_header = true;
        this.indent_body_declarations_compare_to_type_header = true;
        this.indent_breaks_compare_to_cases = true;
        this.indent_switchstatements_compare_to_cases = true;
        this.indent_switchstatements_compare_to_switch = true;
        this.indentation_size = 4;
        this.insert_new_line_after_annotation = true;
        this.insert_new_line_after_opening_brace_in_array_initializer = false;
        this.insert_new_line_at_end_of_file_if_missing = false;
        this.insert_new_line_before_catch_in_try_statement = false;
        this.insert_new_line_before_closing_brace_in_array_initializer = false;
        this.insert_new_line_before_else_in_if_statement = false;
        this.insert_new_line_before_finally_in_try_statement = false;
        this.insert_new_line_before_while_in_do_statement = false;
        this.insert_new_line_in_empty_anonymous_type_declaration = true;
        this.insert_new_line_in_empty_block = true;
        this.insert_new_line_in_empty_enum_constant = true;
        this.insert_new_line_in_empty_enum_declaration = true;
        this.insert_new_line_in_empty_method_body = true;
        this.insert_new_line_in_empty_type_declaration = true;
        this.insert_space_after_and_in_type_parameter = true;
        this.insert_space_after_assignment_operator = true;
        this.insert_space_after_at_in_annotation = false;
        this.insert_space_after_at_in_annotation_type_declaration = false;
        this.insert_space_after_binary_operator = true;
        this.insert_space_after_closing_angle_bracket_in_type_arguments = true;
        this.insert_space_after_closing_angle_bracket_in_type_parameters = true;
        this.insert_space_after_closing_paren_in_cast = true;
        this.insert_space_after_closing_brace_in_block = true;
        this.insert_space_after_colon_in_assert = true;
        this.insert_space_after_colon_in_case = true;
        this.insert_space_after_colon_in_conditional = true;
        this.insert_space_after_colon_in_for = true;
        this.insert_space_after_colon_in_labeled_statement = true;
        this.insert_space_after_comma_in_allocation_expression = true;
        this.insert_space_after_comma_in_annotation = true;
        this.insert_space_after_comma_in_array_initializer = true;
        this.insert_space_after_comma_in_constructor_declaration_parameters = true;
        this.insert_space_after_comma_in_constructor_declaration_throws = true;
        this.insert_space_after_comma_in_enum_constant_arguments = true;
        this.insert_space_after_comma_in_enum_declarations = true;
        this.insert_space_after_comma_in_explicit_constructor_call_arguments = true;
        this.insert_space_after_comma_in_for_increments = true;
        this.insert_space_after_comma_in_for_inits = true;
        this.insert_space_after_comma_in_method_invocation_arguments = true;
        this.insert_space_after_comma_in_method_declaration_parameters = true;
        this.insert_space_after_comma_in_method_declaration_throws = true;
        this.insert_space_after_comma_in_multiple_field_declarations = true;
        this.insert_space_after_comma_in_multiple_local_declarations = true;
        this.insert_space_after_comma_in_parameterized_type_reference = true;
        this.insert_space_after_comma_in_superinterfaces = true;
        this.insert_space_after_comma_in_type_arguments = true;
        this.insert_space_after_comma_in_type_parameters = true;
        this.insert_space_after_ellipsis = true;
        this.insert_space_after_opening_angle_bracket_in_parameterized_type_reference = false;
        this.insert_space_after_opening_angle_bracket_in_type_arguments = false;
        this.insert_space_after_opening_angle_bracket_in_type_parameters = false;
        this.insert_space_after_opening_bracket_in_array_allocation_expression = false;
        this.insert_space_after_opening_bracket_in_array_reference = false;
        this.insert_space_after_opening_brace_in_array_initializer = false;
        this.insert_space_after_opening_paren_in_annotation = false;
        this.insert_space_after_opening_paren_in_cast = false;
        this.insert_space_after_opening_paren_in_catch = false;
        this.insert_space_after_opening_paren_in_constructor_declaration = false;
        this.insert_space_after_opening_paren_in_enum_constant = false;
        this.insert_space_after_opening_paren_in_for = false;
        this.insert_space_after_opening_paren_in_if = false;
        this.insert_space_after_opening_paren_in_method_declaration = false;
        this.insert_space_after_opening_paren_in_method_invocation = false;
        this.insert_space_after_opening_paren_in_parenthesized_expression = false;
        this.insert_space_after_opening_paren_in_switch = false;
        this.insert_space_after_opening_paren_in_synchronized = false;
        this.insert_space_after_opening_paren_in_while = false;
        this.insert_space_after_postfix_operator = false;
        this.insert_space_after_prefix_operator = false;
        this.insert_space_after_question_in_conditional = true;
        this.insert_space_after_question_in_wilcard = false;
        this.insert_space_after_semicolon_in_for = true;
        this.insert_space_after_unary_operator = false;
        this.insert_space_before_and_in_type_parameter = true;
        this.insert_space_before_at_in_annotation_type_declaration = true;
        this.insert_space_before_assignment_operator = true;
        this.insert_space_before_binary_operator = true;
        this.insert_space_before_closing_angle_bracket_in_parameterized_type_reference = false;
        this.insert_space_before_closing_angle_bracket_in_type_arguments = false;
        this.insert_space_before_closing_angle_bracket_in_type_parameters = false;
        this.insert_space_before_closing_brace_in_array_initializer = false;
        this.insert_space_before_closing_bracket_in_array_allocation_expression = false;
        this.insert_space_before_closing_bracket_in_array_reference = false;
        this.insert_space_before_closing_paren_in_annotation = false;
        this.insert_space_before_closing_paren_in_cast = false;
        this.insert_space_before_closing_paren_in_catch = false;
        this.insert_space_before_closing_paren_in_constructor_declaration = false;
        this.insert_space_before_closing_paren_in_enum_constant = false;
        this.insert_space_before_closing_paren_in_for = false;
        this.insert_space_before_closing_paren_in_if = false;
        this.insert_space_before_closing_paren_in_method_declaration = false;
        this.insert_space_before_closing_paren_in_method_invocation = false;
        this.insert_space_before_closing_paren_in_parenthesized_expression = false;
        this.insert_space_before_closing_paren_in_switch = false;
        this.insert_space_before_closing_paren_in_synchronized = false;
        this.insert_space_before_closing_paren_in_while = false;
        this.insert_space_before_colon_in_assert = true;
        this.insert_space_before_colon_in_case = true;
        this.insert_space_before_colon_in_conditional = true;
        this.insert_space_before_colon_in_default = true;
        this.insert_space_before_colon_in_for = true;
        this.insert_space_before_colon_in_labeled_statement = true;
        this.insert_space_before_comma_in_allocation_expression = false;
        this.insert_space_before_comma_in_array_initializer = false;
        this.insert_space_before_comma_in_constructor_declaration_parameters = false;
        this.insert_space_before_comma_in_constructor_declaration_throws = false;
        this.insert_space_before_comma_in_enum_constant_arguments = false;
        this.insert_space_before_comma_in_enum_declarations = false;
        this.insert_space_before_comma_in_explicit_constructor_call_arguments = false;
        this.insert_space_before_comma_in_for_increments = false;
        this.insert_space_before_comma_in_for_inits = false;
        this.insert_space_before_comma_in_method_invocation_arguments = false;
        this.insert_space_before_comma_in_method_declaration_parameters = false;
        this.insert_space_before_comma_in_method_declaration_throws = false;
        this.insert_space_before_comma_in_multiple_field_declarations = false;
        this.insert_space_before_comma_in_multiple_local_declarations = false;
        this.insert_space_before_comma_in_parameterized_type_reference = false;
        this.insert_space_before_comma_in_superinterfaces = false;
        this.insert_space_before_comma_in_type_arguments = false;
        this.insert_space_before_comma_in_type_parameters = false;
        this.insert_space_before_ellipsis = false;
        this.insert_space_before_opening_angle_bracket_in_parameterized_type_reference = false;
        this.insert_space_before_opening_angle_bracket_in_type_arguments = false;
        this.insert_space_before_opening_angle_bracket_in_type_parameters = false;
        this.insert_space_before_opening_brace_in_annotation_type_declaration = true;
        this.insert_space_before_opening_brace_in_anonymous_type_declaration = true;
        this.insert_space_before_opening_brace_in_array_initializer = false;
        this.insert_space_before_opening_brace_in_block = true;
        this.insert_space_before_opening_brace_in_constructor_declaration = true;
        this.insert_space_before_opening_brace_in_enum_constant = true;
        this.insert_space_before_opening_brace_in_enum_declaration = true;
        this.insert_space_before_opening_brace_in_method_declaration = true;
        this.insert_space_before_opening_brace_in_switch = true;
        this.insert_space_before_opening_brace_in_type_declaration = true;
        this.insert_space_before_opening_bracket_in_array_allocation_expression = false;
        this.insert_space_before_opening_bracket_in_array_reference = false;
        this.insert_space_before_opening_bracket_in_array_type_reference = false;
        this.insert_space_before_opening_paren_in_annotation = false;
        this.insert_space_before_opening_paren_in_annotation_type_member_declaration = false;
        this.insert_space_before_opening_paren_in_catch = true;
        this.insert_space_before_opening_paren_in_constructor_declaration = false;
        this.insert_space_before_opening_paren_in_enum_constant = false;
        this.insert_space_before_opening_paren_in_for = true;
        this.insert_space_before_opening_paren_in_if = true;
        this.insert_space_before_opening_paren_in_method_invocation = false;
        this.insert_space_before_opening_paren_in_method_declaration = false;
        this.insert_space_before_opening_paren_in_switch = true;
        this.insert_space_before_opening_paren_in_synchronized = true;
        this.insert_space_before_opening_paren_in_parenthesized_expression = false;
        this.insert_space_before_opening_paren_in_while = true;
        this.insert_space_before_postfix_operator = false;
        this.insert_space_before_prefix_operator = false;
        this.insert_space_before_question_in_conditional = true;
        this.insert_space_before_question_in_wilcard = false;
        this.insert_space_before_semicolon = false;
        this.insert_space_before_semicolon_in_for = false;
        this.insert_space_before_unary_operator = false;
        this.insert_space_between_brackets_in_array_type_reference = false;
        this.insert_space_between_empty_braces_in_array_initializer = false;
        this.insert_space_between_empty_brackets_in_array_allocation_expression = false;
        this.insert_space_between_empty_parens_in_annotation_type_member_declaration = false;
        this.insert_space_between_empty_parens_in_constructor_declaration = false;
        this.insert_space_between_empty_parens_in_enum_constant = false;
        this.insert_space_between_empty_parens_in_method_declaration = false;
        this.insert_space_between_empty_parens_in_method_invocation = false;
        this.compact_else_if = true;
        this.keep_guardian_clause_on_one_line = false;
        this.keep_else_statement_on_same_line = false;
        this.keep_empty_array_initializer_on_one_line = false;
        this.keep_simple_if_on_one_line = false;
        this.keep_then_statement_on_same_line = false;
        this.number_of_empty_lines_to_preserve = 1;
        this.put_empty_statement_on_new_line = false;
        this.tab_size = 4;
        this.page_width = 80;
        this.tab_char = SPACE;
        this.use_tabs_only_for_leading_indentations = false;
    }
    
}
