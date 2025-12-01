def find_fewest_coins(coins, target):
    if target < 0:
        raise ValueError("target can't be negative")

    memo = {}
    def work(rem):
        if rem == 0:
            return []
        if rem in memo:
            return memo[rem]

        best = None
        for coin in coins[::-1]:
            if coin <= rem:
                sub = work(rem - coin)
                if sub is not None:
                    cand = [coin] + sub
                    if best is None or len(cand) < len(best):
                        best = cand

        memo[rem] = best
        return best

    result = work(target)
    if result is None:
        raise ValueError("can't make target with given coins")
    return result[::-1]
