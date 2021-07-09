import { NavBar } from "components/NavBar";
//import { PageInBuild } from "components/PageInBuild";
import { Table } from 'components/Table';

export const BaseCoC = () => {
  return (
    <>
      <div className="container">
        <div className="row">
          <NavBar />
        </div>
        <h1>Base Cash on Cash</h1>

        <hr />

        <Table />

      </div>
    </>
  );
};
