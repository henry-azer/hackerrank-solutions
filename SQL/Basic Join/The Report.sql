SELECT IF(gr.Grade >= 8, st.Name, NULL),
    gr.Grade,
    st.Marks
FROM Students st,
    Grades gr
WHERE st.Marks BETWEEN gr.Min_Mark AND gr.Max_Mark
ORDER BY gr.GRADE DESC,
    st.NAME;