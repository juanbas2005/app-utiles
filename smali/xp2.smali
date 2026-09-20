.class public final Lxp2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lmc2;


# static fields
.field public static final g:Ljava/util/List;


# instance fields
.field public final a:Lg1;

.field public final b:I

.field public final c:I

.field public final d:Ljava/util/List;

.field public final e:I

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    move-object v2, v1

    .line 7
    move-object v3, v1

    .line 8
    move-object v4, v1

    .line 9
    move-object v5, v1

    .line 10
    move-object v6, v1

    .line 11
    move-object v7, v1

    .line 12
    move-object v8, v1

    .line 13
    move-object v9, v1

    .line 14
    filled-new-array/range {v1 .. v9}, [Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lxp2;->g:Ljava/util/List;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move-object v4, v0

    .line 35
    move-object v5, v2

    .line 36
    move-object v7, v0

    .line 37
    move-object v8, v2

    .line 38
    move-object v1, v0

    .line 39
    filled-new-array/range {v1 .. v9}, [Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    return-void
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lxp2;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Lli7;->d:Lev2;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lxp2;->a:Lg1;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iput v1, p0, Lxp2;->b:I

    .line 18
    .line 19
    const/16 v2, 0x9

    .line 20
    .line 21
    iput v2, p0, Lxp2;->c:I

    .line 22
    .line 23
    iput-object v0, p0, Lxp2;->d:Ljava/util/List;

    .line 24
    .line 25
    iput v1, p0, Lxp2;->e:I

    .line 26
    .line 27
    iput v2, p0, Lxp2;->f:I

    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method


# virtual methods
.method public final a()Lbz0;
    .locals 4

    .line 1
    new-instance v0, Lbz0;

    .line 2
    .line 3
    iget-object v1, p0, Lxp2;->a:Lg1;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg1;->a()Lzq5;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lxp2;->d:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iget v2, p0, Lxp2;->b:I

    .line 18
    .line 19
    if-gt v1, v2, :cond_1

    .line 20
    .line 21
    const/16 v1, 0xa

    .line 22
    .line 23
    if-ge v2, v1, :cond_1

    .line 24
    .line 25
    iget p0, p0, Lxp2;->c:I

    .line 26
    .line 27
    if-gt v2, p0, :cond_0

    .line 28
    .line 29
    if-ge p0, v1, :cond_0

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    const-string v0, ") is not in range "

    .line 33
    .line 34
    const-string v1, "..9"

    .line 35
    .line 36
    const-string v3, "The maximum number of digits ("

    .line 37
    .line 38
    invoke-static {v3, p0, v0, v2, v1}, Lpb4;->k(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_1
    const-string p0, "The minimum number of digits ("

    .line 48
    .line 49
    const-string v0, ") is not in range 1..9"

    .line 50
    .line 51
    invoke-static {v2, p0, v0}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final b()Lqd5;
    .locals 6

    .line 1
    new-instance v0, Lqd5;

    .line 2
    .line 3
    new-instance v1, Lz15;

    .line 4
    .line 5
    new-instance v2, Lwp2;

    .line 6
    .line 7
    iget-object v3, p0, Lxp2;->a:Lg1;

    .line 8
    .line 9
    invoke-virtual {v3}, Lg1;->a()Lzq5;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v3}, Lg1;->c()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget v5, p0, Lxp2;->b:I

    .line 18
    .line 19
    iget p0, p0, Lxp2;->c:I

    .line 20
    .line 21
    invoke-direct {v2, v5, p0, v4, v3}, Lwp2;-><init>(IILzq5;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v1, p0}, Lz15;-><init>(Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object v1, La42;->w:La42;

    .line 36
    .line 37
    invoke-direct {v0, p0, v1}, Lqd5;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    return-object v0
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final c()Lg1;
    .locals 0

    .line 1
    iget-object p0, p0, Lxp2;->a:Lg1;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lxp2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lxp2;

    .line 6
    .line 7
    iget v0, p1, Lxp2;->e:I

    .line 8
    .line 9
    iget v1, p0, Lxp2;->e:I

    .line 10
    .line 11
    if-ne v1, v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, Lxp2;->f:I

    .line 14
    .line 15
    iget p1, p1, Lxp2;->f:I

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lxp2;->e:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget p0, p0, Lxp2;->f:I

    .line 6
    .line 7
    add-int/2addr v0, p0

    .line 8
    return v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
