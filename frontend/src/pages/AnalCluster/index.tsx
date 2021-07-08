import { NavBar } from 'components/NavBar';
import { PageInBuild } from 'components/PageInBuild';

export const AnalCluster = () => {
  return (
    <>
      <div className="container">
        <div className="row">
            <NavBar />
        </div>
        <h1>Análise por Cluster</h1>
        
        <hr />

        <div className="row">
          <PageInBuild />
        </div>
      </div>
    </>
    
  );
}