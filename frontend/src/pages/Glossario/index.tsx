import { NavBar } from 'components/NavBar';
import { PageInBuild } from 'components/PageInBuild';

export const Glossario = () => {
  return (
    <>
      <div className="container">
        <div className="row">
            <NavBar />
        </div>
        <h1>Glossário</h1>

        <hr />

        <div className="row">
          <PageInBuild />
        </div>
      </div>
    </>
    
  );
}