---
layout: page_en
title: $T$-test of means for two groups (2 sample $t$-tests) 
date: 2016-09-30 10:02:25 +0900
purposes:
    - Test whether there is a significant difference between the population means of two groups.
    - Using Excel data analysis to test for differences in the population means of the two groups.
flowplayer_conf:
    - embed: false
    - ratio: 0.75
---

Tests for differences in population means for two groups
----------------------

The statistical data we deal with using the “$t$-test” can be divided into two categories: unpaired data or paired data.
Whether the data are paired or not is an important factor when processing data statistically.

When looking at the data, look at the data with caution.

### Unpaired data

The data in one group are unrelated to the data in the other group. 
The order of data within a group can be swapped:

For example, the maximum blood pressure between two wards, scores of two classes, etc.

For unpaired data, we first perform an equal variances test. 
Then, a difference test is performed.

-   Assuming equal variances (Student's $t$-test)
    -   Test for the difference between two population means:
-   Not assuming equal variances (Welch's $t$-test)
    -   Test for the difference of two population means

### Paired data

Data in one group are paired with the data in the other group. 
The order of data within a group cannot be swapped:

For example, the highest and lowest blood pressure, the first and second semester scores, etc.

This one can be tested without testing for equal variances.

-   Test for the difference between two population means.

### Dependent and Explanatory variables

When multiple variables are used in an analysis, the concepts of dependent and explanatory variables may become necessary.

<dl>
<dt>Dependent variable ($y$):</dt>
<dd>
This is a variable for forecasting and factor analysis in regression analysis, etc. 
It is the outcome of something. It is also called a response variable, measured variable, explained variable, outcome variable, experimental variable, and output variable. 
It corresponds to $y$ in a linear regression model ($y = a_0 + a_1x_1 + _\cdots + a_nx_n$) .
</dd>
<dt>Explanatory variable ($x$):</dt>
<dd>
This is a variable that influences the dependent variable. 
It is the cause of something. It is also called the predictor variable, controlled variable, manipulated variable, and input variable. 
It corresponds to $x_1 {}_\cdots x_n$ in a linear regression model ($y = a_0 + a_1x_1 + _\cdots + a_nx_n$).
</dd>
</dl>


Tests for the difference between two population means when equal variances are assumed (unpaired data)
---------------------------------------------------------------

### Exercise 1

We examined the test results of class A and class B at one school and obtained the following results. 
Can you say whether there is a difference in the average scores between classes A and B?

Table 1: Test results (scores) for one school.

{% screenshot en/Q1.png "Test results (scores) for one school." %}

### Setting a hypothesis

- Null hypothesis $H_0$ : $\mu_A = \mu_B$. There is no difference in the average scores of classes A and B.
- Alternative hypothesis $H_1$ : $\mu_A \neq \mu_B$. There is a difference in the average scores of classes A and class B.

### Setting the significance level $\alpha$

We set the significance level $\alpha$ = 0.05.

### Calculation of the covariance $V$

The covariance $V$ is obtained using the following formula:

\begin{align}
  V=\frac{S_A+S_B}{\varphi_A+\varphi_B}
\end{align}

$S_A,\ S_B$ = sum of the squares of the variances of each group.
$n_A,\ n_B$ = he amount of data in each group: 
$\varphi_A = n_A-1,\ \varphi_B = n_B-1$

### Calculation of the test statistic $t$-value

The test statistic $t$-value is obtained using the following formula:

\begin{align}
  t=\frac{\bar{x}_A - \bar{x}_B}{\sqrt{V(\frac{1}{n_A}+\frac{1}{n_B})}}
\end{align}

### Calculation of $p$-value

Find the probability $p$-value to compare with the significance level. 
The $p$-value is the probability that a value greater than or equal to $|t|$ occurs in the $t$-distribution with degrees of freedom $\varphi_A + \varphi_B$.

### Interpreting the result

$p$-value $<$ significance level $\alpha \rightarrow$ Null hypothesis $H_0$ is rejected.

$p$-value $>$ significance level $\alpha \rightarrow$ Null hypothesis $H_0$ cannot be rejected.

### Calculating on Excel

Using Excel, let us begin with Exercise 1.

&#9312; First,  enter Table 1.

&#9313; Next, we test whether the two datasets have equal variances. Click on [Data Analysis] on the [Data] ribbon and select [F Test: Two-Sample for Variances].

{% screenshot en/dataanalysis.png "Explanation of Data Analysis tools" %}

{% screenshot en/ftest01.png "F Test: Two-Sample for Variances 1" %}

&#9314; Enter the data range for classes A and B in variables 1 and 2, respectively. The output destination should be selected somewhere on the same sheet (in this case, “M4").

{% screenshot en/ftest02.png "F Test: Two-Sample for Variances 2" %}

&#9315; Click [OK] to display the output results. $p$-value or others are shown as '##', the cell may be too small. Try widening the width.

{% screenshot en/ftest03.png "Result of F Test: Two-Sample for Variances" %}

$p$-value = 0.430614 $>$ significance level $\alpha$ = 0.05. 
Thus, we can say that the data have equal variances.

&#9316; Therefore, we perform Student’s $t$-test. From [Data Analysis], we choose [$t$-Test: Two-Sample Assuming Equal Variances] this time.

{% screenshot en/ttest01.png "t-Test: Two-Sample Assuming Equal Variances 1" %}

&#9317; As before, enter a range of data for variables 1 and 2. Be careful not to overwrite the output destination with the results of the F-test. In this case, we selected M16.

{% screenshot en/ttest02.png "T-test: Two-Sample Assuming Equal Variances 2" %}

The output result.

{% screenshot en/ttest03.png "Result of t-test: Two-Sample Assuming Equal Variances" %}

$A$ p-value = 0.030929 was obtained. 
The significance level $\alpha$ was set to 0.05. 
Therefore, because $p$-value = 0.030929 $<$ significance level $\alpha$ = 0.05, the null hypothesis $H_0$ is rejected. 
Therefore, we conclude that there is a difference in the population mean of scores between classes A and B.


Testing the difference between two population means when equal variances are not assumed (unpaired data)
-----------------------------------------------------------------

### Exercise 2

We examined the test results of classes C and D at one school and obtained the following results. 
Can you say that there is a difference in the average class score between classes C and D?

Table 2: Test results (scores) for one school.

{% screenshot en/Q2.png "Test results (scores) for one school" %}

### Setting a hypothesis

-   Null hypothesis $H_0$ : $\mu_C = \mu_D$. There is no difference in the average score of classes C and D.
-   Alternative hypothesis $H_1$ : $\mu_C \neq \mu_D$. There is a difference in the average scores of classes C and D.

### Setting the significance level $\alpha$

We set the significance level $\alpha$ = 0.05.

### Calculation of the test statistic $t$-value (Welch's $t$-test)

This time, the test statistic t-value is obtained using the following formula:

\begin{align}
  t_0=\frac{\bar{x}_A-\bar{x}_B}{\sqrt{\frac{V_A}{n_A}+\frac{V_B}{n_B}}}
\end{align}

### Calculation of effective degrees of freedom $\varphi^*$

The following equation gives the effective degrees of freedom $\varphi^*$.

\begin{align}
  \varphi^*=\frac{(\frac{V_A}{n_A}+\frac{V_B}{n_B})^2}{(\frac{V_A}{n_A})^2\frac{1}{n_A-1}+(\frac{V_B}{n_B})^2\frac{1}{n_B-1}}
\end{align}

### Calculation of $p$-value

Find the probability $p$-value to compare with the significance level. 
The $p$-value is the probability that a value greater than or equal to $|t|$ occurs in the $\varphi^*$ degrees of freedom.

### Interpreting the result

$p$-value $<$ significance level $\alpha$ &rarr; Null hypothesis $H_0$ is rejected

$p$-value $>$ significance level $\alpha$ &rarr; Null hypothesis $H_0$ cannot be rejected

### Calculating on Excel

Using Excel, let us begin with Exercise 2.

&#9312; First, enter Table 2. As in Exercise 1, we use the F Test: Two-Sample for Variances.

{% screenshot en/ftest04.png "F Test: Two-Sample for Variances" %}

{% screenshot en/ftest05.png "Result of F Test: Two-Sample for Variances" %}

&#9313; $p$-value = 0.01824 $<$ significance level $\alpha$ = 0.05, so there is no equal variance. 
Therefore, the $t$-test [$t$-Test: Two Sample Assuming Unequal Variances] is used in this case.

{% screenshot en/ttest04.png "T-test: Two Sample Assuming Unequal Variances" %}

&#9314; The output result.

{% screenshot en/ttest05.png "Result of t-test: Two Sample Assuming Unequal Variances" %}

A $p$-value = 0.024411 was obtained. 
The significance level $\alpha$ was set to 0.05. 
Therefore, because $p$-value = 0.024411 $<$ significance level $\alpha$ = 0.05, the null hypothesis $H_0$ is rejected. 
Therefore, we conclude that there is a difference in the population mean of scores between classes C and D.


Test for the difference between two population means (paired data)
-----------------------------------------

### Exercise 3

The following data show the grades of 12 college students in a full-year class for their first- and second-semester examinations. 
Do you think the grades on the second-semester exam (B) changed compared to the grades on the first-semester exam (A)?

Table 3: Examination grades (points).

{% screenshot en/Q3.png "Examination grades (points)." %}

### Setting a hypothesis

- Null hypothesis $H_0$ : $\mu_B - \mu_A = 0$. There is no difference in the scores of the second-semester exam and the first-semester exam.
- Alternative hypothesis $H_1$ : $\mu_B - \mu_A > 0$. There is a difference in the scores of the second-semester exam and the first-semester exam.

### Setting the significance level $\alpha$

We set the significance level $\alpha$ = 0.05.

### Calculating the difference for each pair

The first semester grade and the second semester grade are treated as one pair.

$d_i = x_{A_i} - x_{B_i}$

From this formula, find the difference for each pair. 
Then, the mean $\bar{d}$ of the difference $d_i$ is calculated and variance $V_d$ is calculated.

### Calculation of the test statistic $t$-value (Welch's $t$-test)

This time, the test statistic t-value is obtained using the following formula:

\begin{align}
  t=\frac{\bar{d}}{\sqrt{\frac{V_d}{n}}}
\end{align}

### Calculation of $p$-value

Find the probability $p$-value to compare with the significance level. 
The $p$-value is the probability that a value greater than or equal to $|t|$ occurs in the $t$-distribution with $\varphi = n-1$ degrees of freedom.

### Interpreting the result

$p$-value $<$ significance level $\alpha \rightarrow$ Null hypothesis $H_0$ is rejected

$p$-value $>$ significance level $\alpha \rightarrow$ Null hypothesis $H_0$ cannot be rejected

### Calculating on Excel

Using Excel, let us begin with Exercise 3.

&#9312; First, enter Table 3. It is not necessary to test for equal variances in the paired data. 
From [Data Analysis], select [$t$-Test: Paired Two Sample for Means].

{% screenshot en/ttest06.png "T-test: Paired Two Sample for Means 1" %}

&#9313; Enter the respective data ranges in variables 1 and 2.

{% screenshot en/ttest07.png "T-test: Paired Two Sample for Means 2" %}

The output result.

{% screenshot en/ttest08.png "Result of t-test: Paired Two Sample for Means" %}

A $p$-value = 0.023102 was obtained. 
Therefore, because $p$-value = 0.023102 $<$ significance level $\alpha\$ = 0.05, the null hypothesis $H_0$ is rejected. 
Therefore, we conclude that there is a significant difference between the mean score of 63.5833 in the first semester and 69.75 in the second semester, suggesting that the second semester exam performance (B) changed compared to the first semester exam performance (A).


Task 1
------

The following results were obtained by examining the protein content of the same type of soybeans harvested in regions A and B. 
Assuming normality of the content, test for regional differences at the 5 % level of significance.

Table 4: Protein content (%) of soybeans from regions A and B

{% screenshot en/03_41Q.png "Protein content rate (%)" %}


Task 2
------

The following data show the hourly wage for a part-time job at a restaurant in City A and one in City B. 
Is there any difference in the hourly wage for part-time jobs at those restaurants in the two areas?

Table 5: Hourly wage (in yen) for part-time jobs at restaurants in Cities A and B, respectively.

{% screenshot en/03_42Q.png "Hourly wage (in yen) for part-time jobs" %}


Task 3
------

The following data show the weight before and after seven people went on a certain diet. 
Would it be fair to say that this diet resulted in a change in weight?

Table 6: Weight (kg) before and after a diet.

{% screenshot en/03_43Q.png "Weight (kg) " %}

