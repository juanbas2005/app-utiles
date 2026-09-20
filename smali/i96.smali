.class public final Li96;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final w:Lh96;

.field public x:Luf0;

.field public y:I


# direct methods
.method public constructor <init>(Lj96;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh96;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lh96;-><init>(Lbg0;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Li96;->w:Lh96;

    .line 10
    .line 11
    invoke-virtual {v0}, Lh96;->a()Lb94;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Luf0;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Luf0;-><init>(Lb94;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Li96;->x:Luf0;

    .line 21
    .line 22
    iget p1, p1, Lj96;->x:I

    .line 23
    .line 24
    iput p1, p0, Li96;->y:I

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget p0, p0, Li96;->y:I

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
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

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Li96;->x:Luf0;

    .line 2
    .line 3
    invoke-virtual {v0}, Luf0;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Li96;->w:Lh96;

    .line 10
    .line 11
    invoke-virtual {v0}, Lh96;->a()Lb94;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Luf0;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Luf0;-><init>(Lb94;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Li96;->x:Luf0;

    .line 21
    .line 22
    :cond_0
    iget v0, p0, Li96;->y:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    iput v0, p0, Li96;->y:I

    .line 27
    .line 28
    iget-object p0, p0, Li96;->x:Luf0;

    .line 29
    .line 30
    invoke-virtual {p0}, Luf0;->a()B

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
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

.method public final remove()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
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
