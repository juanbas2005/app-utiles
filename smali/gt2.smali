.class public final Lgt2;
.super Lht2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final d:Lgt2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lgt2;

    .line 2
    .line 3
    sget-object v1, Ln27;->f:Lup2;

    .line 4
    .line 5
    sget-object v2, Ldt2;->d:Ldt2;

    .line 6
    .line 7
    iget v2, v2, Lht2;->c:I

    .line 8
    .line 9
    add-int/lit8 v2, v2, -0x1

    .line 10
    .line 11
    const-string v3, "SuspendFunction"

    .line 12
    .line 13
    invoke-direct {v0, v1, v3, v2}, Lht2;-><init>(Lup2;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lgt2;->d:Lgt2;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method
