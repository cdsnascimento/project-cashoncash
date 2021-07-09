import { NavBar } from 'components/NavBar';
import { Table } from 'components/Table';


export const BaseRoic = () => {
  return (
    <>
      <div className="container">
        <div className="row">
            <NavBar />
        </div>
        <h1>Base ROIC</h1>

        <hr />

        <Table />

      </div>
    </>
    
  );
}