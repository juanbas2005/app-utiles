.class public final Lwl8;
.super Ljava/util/AbstractList;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final w:Lul8;

.field public final x:Lvl8;


# direct methods
.method public constructor <init>(Lul8;Lvl8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwl8;->w:Lul8;

    .line 5
    .line 6
    iput-object p2, p0, Lwl8;->x:Lvl8;

    .line 7
    .line 8
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lwl8;->w:Lul8;

    .line 2
    .line 3
    check-cast v0, Lol8;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lol8;->g(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object p0, p0, Lwl8;->x:Lvl8;

    .line 10
    .line 11
    check-cast p0, Lnx8;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Llk8;->b(I)Llk8;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    sget-object p0, Llk8;->x:Llk8;

    .line 23
    .line 24
    :cond_0
    return-object p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lwl8;->w:Lul8;

    .line 2
    .line 3
    check-cast p0, Lol8;

    .line 4
    .line 5
    iget p0, p0, Lol8;->y:I

    .line 6
    .line 7
    return p0
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
