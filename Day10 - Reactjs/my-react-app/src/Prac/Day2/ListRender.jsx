import EmployeeCard from "./EmployeeCard";

function EmployeeRender(){
    const employees = [
        { id : 1, name :"John", active : true},
        { id : 2, name :"Marston"},
        { id : 3, name :"Alice"}
    ];
    return (
        <>
            {
                employees
                .filter(emp => emp.active)
                .map(emp =>(<EmployeeCard key={emp.id} 
                name = {emp.name} />))
            }        
        </>
    );
}
export default EmployeeRender