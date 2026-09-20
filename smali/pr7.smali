.class public final Lpr7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lzr3;


# static fields
.field public static final a:Lpr7;

.field public static final b:Lub3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lpr7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpr7;->a:Lpr7;

    .line 7
    .line 8
    const-string v0, "kotlin.UInt"

    .line 9
    .line 10
    sget-object v1, Lue3;->a:Lue3;

    .line 11
    .line 12
    invoke-static {v1, v0}, Lb96;->a(Lzr3;Ljava/lang/String;)Lub3;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lpr7;->b:Lub3;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lpr7;->b:Lub3;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lok1;->q(Lll6;)Lok1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lok1;->o()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    new-instance p1, Llr7;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Llr7;-><init>(I)V

    .line 14
    .line 15
    .line 16
    return-object p1
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
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lpr7;->b:Lub3;

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

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Llr7;

    .line 2
    .line 3
    iget p0, p2, Llr7;->w:I

    .line 4
    .line 5
    sget-object p2, Lpr7;->b:Lub3;

    .line 6
    .line 7
    invoke-interface {p1, p2}, Lj42;->m(Lll6;)Lj42;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1, p0}, Lj42;->z(I)V

    .line 12
    .line 13
    .line 14
    return-void
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
