.class public final Ljd6;
.super Lz65;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public c:F

.field public final synthetic d:Lkd6;


# direct methods
.method public constructor <init>(Lkd6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljd6;->d:Lkd6;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Ljd6;->c:F

    .line 8
    .line 9
    return-void
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
.end method


# virtual methods
.method public final K(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Ljd6;->c:F

    .line 2
    .line 3
    iget-object v1, p0, Ljd6;->d:Lkd6;

    .line 4
    .line 5
    iget-object v1, v1, Lkd6;->z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lid6;

    .line 8
    .line 9
    iget-object v1, v1, Lid6;->d:Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    add-float/2addr p1, v0

    .line 16
    iput p1, p0, Ljd6;->c:F

    .line 17
    .line 18
    return-void
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
