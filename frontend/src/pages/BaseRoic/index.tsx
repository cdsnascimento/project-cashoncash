import { NavBar } from 'components/NavBar';
import { PageInBuild } from 'components/PageInBuild';

export const BaseRoic = () => {
  return (
    <>
      <div className="container">
        <div className="row">
            <NavBar />
        </div>
        <h1>Base ROIC</h1>

        <hr />

        <div className="row">
          <PageInBuild />
        </div>
      </div>
    </>
    
  );
}