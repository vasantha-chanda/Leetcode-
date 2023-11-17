/**
 * @param {character[][]} grid
 * @return {number}
 */
const numIslands =(grid)=> {
    let count=0;
    for(let rowIndex in grid){
        for(let colIndex in grid[rowIndex]){
            if(grid[rowIndex][colIndex] === '1'){
                count++;
                helper(parseInt(rowIndex),parseInt(colIndex),grid);
            }
        }
    }
   return count; 
};

const helper=(rowIn,colIn,grid)=>{
   if(grid[rowIn] === undefined || grid[rowIn][colIn] === undefined || grid[rowIn][colIn] === '0') return;  
    grid[rowIn][colIn] = '0';
    helper(rowIn+1,colIn,grid);
    helper(rowIn-1,colIn,grid);
    helper(rowIn,colIn+1,grid);
    helper(rowIn,colIn-1,grid);
}