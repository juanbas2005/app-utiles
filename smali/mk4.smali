.class public final Lmk4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic a:Lmk4;

.field public static final b:Lz97;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmk4;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lmk4;->a:Lmk4;

    .line 7
    .line 8
    sget-object v0, Lx10;->I:Lx10;

    .line 9
    .line 10
    new-instance v1, Lz97;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lz97;-><init>(Lsr2;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, Lmk4;->b:Lz97;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static a()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lmk4;->b:Lz97;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz97;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
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
