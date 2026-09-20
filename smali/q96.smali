.class public abstract Lq96;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lo96;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Llf5;

    .line 2
    .line 3
    const/high16 v1, 0x42480000    # 50.0f

    .line 4
    .line 5
    invoke-direct {v0, v1}, Llf5;-><init>(F)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lo96;

    .line 9
    .line 10
    invoke-direct {v1, v0, v0, v0, v0}, Lo96;-><init>(La81;La81;La81;La81;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lq96;->a:Lo96;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final a(F)Lo96;
    .locals 1

    .line 1
    new-instance v0, Lmx1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lmx1;-><init>(F)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lo96;

    .line 7
    .line 8
    invoke-direct {p0, v0, v0, v0, v0}, Lo96;-><init>(La81;La81;La81;La81;)V

    .line 9
    .line 10
    .line 11
    return-object p0
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
.end method

.method public static b(FF)Lo96;
    .locals 4

    .line 1
    new-instance v0, Lo96;

    .line 2
    .line 3
    new-instance v1, Lmx1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lmx1;-><init>(F)V

    .line 6
    .line 7
    .line 8
    new-instance p0, Lmx1;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lmx1;-><init>(F)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lmx1;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {p1, v2}, Lmx1;-><init>(F)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lmx1;

    .line 20
    .line 21
    invoke-direct {v3, v2}, Lmx1;-><init>(F)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, p0, p1, v3}, Lo96;-><init>(La81;La81;La81;La81;)V

    .line 25
    .line 26
    .line 27
    return-object v0
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
